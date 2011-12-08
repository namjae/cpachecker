/* Generated by CIL v. 1.3.7 */
/* print_CIL_Input is true */

#line 14 "../versisec/bind/progs1/../lib/stubs.h"
typedef int size_t;
#line 7 "../versisec/bind/progs1/../bind.h"
typedef char u_char;
#line 8 "../versisec/bind/progs1/../bind.h"
typedef int u_int;
#line 9 "../versisec/bind/progs1/../bind.h"
typedef int u_int32_t;
#line 27 "../versisec/bind/progs1/../lib/stubs.h"
extern unsigned int strlen(char const   *s ) ;
#line 53
extern void *r_memcpy(void *dest , void const   *src , size_t n ) ;
#line 46 "../versisec/bind/progs1/../bind.h"
extern int dn_expand(u_char const   *msg , u_char const   *eomorig , u_char const   *comp_dn ,
                     char *exp_dn , int length ) ;
#line 50
extern int nondet_int() ;
#line 71 "/usr/include/assert.h"
extern  __attribute__((__nothrow__, __noreturn__)) void __assert_fail(char const   *__assertion ,
                                                                      char const   *__file ,
                                                                      unsigned int __line ,
                                                                      char const   *__function ) ;
#line 26 "../versisec/bind/progs1/bindCA-1999-14rrextract-nxt_expands_vars_ok.c"
extern int ( /* missing proto */  nondet_short)() ;
#line 32
extern int ( /* missing proto */  nondet_long)() ;
#line 6 "../versisec/bind/progs1/bindCA-1999-14rrextract-nxt_expands_vars_ok.c"
static int rrextract(u_char *msg , int msglen , u_char *rrp , u_char *dname , int namelen ) 
{ u_char *eom ;
  u_char *cp ;
  u_char *cp1 ;
  u_char *rdatap ;
  u_int class ;
  u_int type ;
  u_int dlen ;
  int n ;
  int n1 ;
  int n2 ;
  u_int32_t ttl ;
  u_char data[14] ;
  int tmp ;
  int tmp___0 ;
  unsigned int tmp___1 ;
  unsigned int tmp___2 ;
  unsigned long __cil_tmp22 ;
  unsigned long __cil_tmp23 ;
  u_char const   *__cil_tmp24 ;
  u_char const   *__cil_tmp25 ;
  u_char const   *__cil_tmp26 ;
  unsigned long __cil_tmp27 ;
  u_char *__cil_tmp28 ;
  unsigned long __cil_tmp29 ;
  unsigned long __cil_tmp30 ;
  u_char *__cil_tmp31 ;
  unsigned long __cil_tmp32 ;
  u_char const   *__cil_tmp33 ;
  u_char const   *__cil_tmp34 ;
  u_char const   *__cil_tmp35 ;
  unsigned long __cil_tmp36 ;
  unsigned long __cil_tmp37 ;
  u_char *__cil_tmp38 ;
  int __cil_tmp39 ;
  unsigned long __cil_tmp40 ;
  unsigned long __cil_tmp41 ;
  u_char *__cil_tmp42 ;
  char const   *__cil_tmp43 ;
  unsigned int __cil_tmp44 ;
  unsigned long __cil_tmp45 ;
  unsigned long __cil_tmp46 ;
  u_char *__cil_tmp47 ;
  unsigned long __cil_tmp48 ;
  unsigned long __cil_tmp49 ;
  unsigned long __cil_tmp50 ;
  unsigned long __cil_tmp51 ;
  unsigned long __cil_tmp52 ;
  u_char *__cil_tmp53 ;
  char const   *__cil_tmp54 ;
  unsigned int __cil_tmp55 ;
  unsigned long __cil_tmp56 ;
  unsigned long __cil_tmp57 ;
  u_int __cil_tmp58 ;
  unsigned long __cil_tmp59 ;
  void *__cil_tmp60 ;
  void const   *__cil_tmp61 ;

  {
  {
#line 15
  __cil_tmp22 = 13 * 1UL;
#line 15
  __cil_tmp23 = (unsigned long )(data) + __cil_tmp22;
#line 15
  *((u_char *)__cil_tmp23) = (char)0;
#line 17
  cp = rrp;
#line 18
  eom = msg + msglen;
#line 20
  __cil_tmp24 = (u_char const   *)msg;
#line 20
  __cil_tmp25 = (u_char const   *)eom;
#line 20
  __cil_tmp26 = (u_char const   *)cp;
#line 20
  n = dn_expand(__cil_tmp24, __cil_tmp25, __cil_tmp26, dname, namelen);
  }
#line 20
  if (n < 0) {
#line 21
    return (-1);
  } else {

  }
#line 24
  cp = cp + n;
  {
#line 25
  while (1) {
    while_0_continue: /* CIL Label */ ;
    {
#line 25
    __cil_tmp27 = (unsigned long )eom;
#line 25
    __cil_tmp28 = cp + 10;
#line 25
    __cil_tmp29 = (unsigned long )__cil_tmp28;
#line 25
    if (__cil_tmp29 > __cil_tmp27) {
#line 25
      return (-1);
    } else {

    }
    }
    goto while_0_break;
  }
  while_0_break: /* CIL Label */ ;
  }
  {
#line 26
  while (1) {
    while_1_continue: /* CIL Label */ ;
    {
#line 26
    type = nondet_short();
#line 26
    cp = cp + 2;
    }
    goto while_1_break;
  }
  while_1_break: /* CIL Label */ ;
  }
  {
#line 27
  while (1) {
    while_2_continue: /* CIL Label */ ;
    {
#line 27
    class = nondet_short();
#line 27
    cp = cp + 2;
    }
    goto while_2_break;
  }
  while_2_break: /* CIL Label */ ;
  }
#line 29
  if (class > 100) {
#line 30
    return (-1);
  } else {

  }
  {
#line 32
  while (1) {
    while_3_continue: /* CIL Label */ ;
    {
#line 32
    ttl = nondet_long();
#line 32
    cp = cp + 4;
    }
    goto while_3_break;
  }
  while_3_break: /* CIL Label */ ;
  }
#line 34
  if (ttl > 101) {
#line 35
    ttl = 0;
  } else {

  }
  {
#line 37
  while (1) {
    while_4_continue: /* CIL Label */ ;
    {
#line 37
    dlen = nondet_short();
#line 37
    cp = cp + 2;
    }
    goto while_4_break;
  }
  while_4_break: /* CIL Label */ ;
  }
  {
#line 38
  while (1) {
    while_5_continue: /* CIL Label */ ;
    {
#line 38
    __cil_tmp30 = (unsigned long )eom;
#line 38
    __cil_tmp31 = cp + dlen;
#line 38
    __cil_tmp32 = (unsigned long )__cil_tmp31;
#line 38
    if (__cil_tmp32 > __cil_tmp30) {
#line 38
      return (-1);
    } else {

    }
    }
    goto while_5_break;
  }
  while_5_break: /* CIL Label */ ;
  }
  {
#line 40
  rdatap = cp;
#line 42
  tmp = nondet_int();
  }
#line 42
  if (tmp) {
#line 43
    return (-1);
  } else {

  }
  {
#line 49
  __cil_tmp33 = (u_char const   *)msg;
#line 49
  __cil_tmp34 = (u_char const   *)eom;
#line 49
  __cil_tmp35 = (u_char const   *)cp;
#line 49
  __cil_tmp36 = 0 * 1UL;
#line 49
  __cil_tmp37 = (unsigned long )(data) + __cil_tmp36;
#line 49
  __cil_tmp38 = (u_char *)__cil_tmp37;
#line 49
  __cil_tmp39 = (int )14UL;
#line 49
  n = dn_expand(__cil_tmp33, __cil_tmp34, __cil_tmp35, __cil_tmp38, __cil_tmp39);
  }
#line 51
  if (n < 0) {
#line 52
    return (-1);
  } else {
#line 51
    if (n >= dlen) {
#line 52
      return (-1);
    } else {

    }
  }
  {
#line 55
  tmp___0 = nondet_int();
  }
#line 55
  if (tmp___0) {
#line 56
    return (-1);
  } else {

  }
  {
#line 58
  cp = cp + n;
#line 60
  __cil_tmp40 = 0 * 1UL;
#line 60
  __cil_tmp41 = (unsigned long )(data) + __cil_tmp40;
#line 60
  __cil_tmp42 = (u_char *)__cil_tmp41;
#line 60
  __cil_tmp43 = (char const   *)__cil_tmp42;
#line 60
  tmp___1 = strlen(__cil_tmp43);
#line 60
  __cil_tmp44 = tmp___1 + 1U;
#line 60
  n1 = (int )__cil_tmp44;
#line 61
  __cil_tmp45 = 0 * 1UL;
#line 61
  __cil_tmp46 = (unsigned long )(data) + __cil_tmp45;
#line 61
  __cil_tmp47 = (u_char *)__cil_tmp46;
#line 61
  cp1 = __cil_tmp47 + n1;
#line 63
  n2 = dlen - n;
  }
  {
#line 64
  __cil_tmp48 = (unsigned long )n1;
#line 64
  __cil_tmp49 = 14UL - __cil_tmp48;
#line 64
  __cil_tmp50 = (unsigned long )n2;
#line 64
  if (__cil_tmp50 > __cil_tmp49) {
#line 65
    return (-1);
  } else {

  }
  }
  {
#line 68
  __cil_tmp51 = 0 * 1UL;
#line 68
  __cil_tmp52 = (unsigned long )(data) + __cil_tmp51;
#line 68
  __cil_tmp53 = (u_char *)__cil_tmp52;
#line 68
  __cil_tmp54 = (char const   *)__cil_tmp53;
#line 68
  tmp___2 = strlen(__cil_tmp54);
  }
  {
#line 68
  __cil_tmp55 = tmp___2 + 1U;
#line 68
  __cil_tmp56 = (unsigned long )__cil_tmp55;
#line 68
  __cil_tmp57 = 14UL - __cil_tmp56;
#line 68
  __cil_tmp58 = dlen - n;
#line 68
  __cil_tmp59 = (unsigned long )__cil_tmp58;
#line 68
  if (__cil_tmp59 <= __cil_tmp57) {

  } else {
    {
#line 68
    __assert_fail("dlen - n <= sizeof data - (strlen((char *)data) + 1)", "../versisec/bind/progs1/bindCA-1999-14rrextract-nxt_expands_vars_ok.c",
                  68U, "rrextract");
    }
  }
  }
  {
#line 71
  __cil_tmp60 = (void *)cp1;
#line 71
  __cil_tmp61 = (void const   *)cp;
#line 71
  r_memcpy(__cil_tmp60, __cil_tmp61, n2);
  }
#line 73
  return (0);
}
}
#line 76 "../versisec/bind/progs1/bindCA-1999-14rrextract-nxt_expands_vars_ok.c"
int main(void) 
{ int msglen ;
  int ret ;
  u_char *dp ;
  u_char name[3] ;
  u_char msg[14] ;
  unsigned long __cil_tmp6 ;
  unsigned long __cil_tmp7 ;
  unsigned long __cil_tmp8 ;
  unsigned long __cil_tmp9 ;
  unsigned long __cil_tmp10 ;
  unsigned long __cil_tmp11 ;
  unsigned long __cil_tmp12 ;
  unsigned long __cil_tmp13 ;
  u_char *__cil_tmp14 ;
  unsigned long __cil_tmp15 ;
  unsigned long __cil_tmp16 ;
  u_char *__cil_tmp17 ;

  {
  {
#line 83
  __cil_tmp6 = 2 * 1UL;
#line 83
  __cil_tmp7 = (unsigned long )(name) + __cil_tmp6;
#line 83
  *((u_char *)__cil_tmp7) = (char)0;
#line 84
  __cil_tmp8 = 13 * 1UL;
#line 84
  __cil_tmp9 = (unsigned long )(msg) + __cil_tmp8;
#line 84
  *((u_char *)__cil_tmp9) = (char)0;
#line 86
  msglen = 4;
#line 87
  __cil_tmp10 = 0 * 1UL;
#line 87
  __cil_tmp11 = (unsigned long )(msg) + __cil_tmp10;
#line 87
  dp = (u_char *)__cil_tmp11;
#line 89
  __cil_tmp12 = 0 * 1UL;
#line 89
  __cil_tmp13 = (unsigned long )(msg) + __cil_tmp12;
#line 89
  __cil_tmp14 = (u_char *)__cil_tmp13;
#line 89
  __cil_tmp15 = 0 * 1UL;
#line 89
  __cil_tmp16 = (unsigned long )(name) + __cil_tmp15;
#line 89
  __cil_tmp17 = (u_char *)__cil_tmp16;
#line 89
  ret = rrextract(__cil_tmp14, msglen, dp, __cil_tmp17, 3);
  }
#line 91
  return (0);
}
}
