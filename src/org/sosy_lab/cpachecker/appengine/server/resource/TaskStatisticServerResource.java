/*
 *  CPAchecker is a tool for configurable software verification.
 *  This file is part of CPAchecker.
 *
 *  Copyright (C) 2007-2014  Dirk Beyer
 *  All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 *  CPAchecker web page:
 *    http://cpachecker.sosy-lab.org
 */
package org.sosy_lab.cpachecker.appengine.server.resource;

import org.restlet.data.MediaType;
import org.restlet.data.Status;
import org.restlet.ext.wadl.WadlServerResource;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.ResourceException;
import org.sosy_lab.cpachecker.appengine.dao.TaskDAO;
import org.sosy_lab.cpachecker.appengine.entity.Task;
import org.sosy_lab.cpachecker.appengine.entity.TaskStatistic;
import org.sosy_lab.cpachecker.appengine.json.TaskMixinAnnotations;
import org.sosy_lab.cpachecker.appengine.json.TaskStatisticMixinAnnotations;
import org.sosy_lab.cpachecker.appengine.server.common.TaskStatisticResource;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


public class TaskStatisticServerResource extends WadlServerResource implements TaskStatisticResource {

  private TaskStatistic stats = null;

  @Override
  protected void doInit() throws ResourceException {
    super.doInit();

    Task task = TaskDAO.load(getAttribute("taskKey"));

    if (task != null) {
      stats = task.getStatistic();
    }

    if (stats == null) {
      getResponse().setStatus(Status.CLIENT_ERROR_NOT_FOUND);
      getResponse().commit();
    }
  }

  @Override
  public Representation statsAsJson() {
    ObjectMapper mapper = new ObjectMapper();
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    mapper.addMixInAnnotations(Task.class, TaskMixinAnnotations.KeyOnly.class);
    mapper.addMixInAnnotations(TaskStatistic.class, TaskStatisticMixinAnnotations.Full.class);

    try {
      return new StringRepresentation(mapper.writeValueAsString(stats), MediaType.APPLICATION_JSON);
    } catch (JsonProcessingException e) {
      return null;
    }
  }

}
