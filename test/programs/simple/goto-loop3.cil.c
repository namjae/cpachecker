/* Generated by CIL v. 1.3.7 */
/* print_CIL_Input is true */

#line 3 "goto-loop3.c"
int main(void) 
{ int counter ;

  {
#line 5
  counter = 0;
  LOOPSTART: 
#line 8
  if (counter < 5) {
#line 9
    counter = counter + 1;
    goto LOOPSTART;
  } else {
#line 12
    if (counter < 10) {
#line 13
      counter = counter + 1;
      goto LOOPSTART;
    } else {
#line 16
      if (counter < 15) {
#line 17
        counter = counter + 1;
        goto LOOPSTART;
      } else {

      }
    }
  }
#line 21
  if (counter == 4) {
    goto ERROR;
  } else {
    goto END;
  }
  ERROR: 
  goto ERROR;
  END: 
#line 32
  return (0);
}
}
