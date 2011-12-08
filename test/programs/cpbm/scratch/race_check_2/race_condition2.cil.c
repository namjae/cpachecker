/* Generated by CIL v. 1.3.7 */
/* print_CIL_Input is true */

#line 203 "../spu_mfcio.h"
extern void mfc_put(void volatile   *ls , unsigned int ea , unsigned int size , unsigned int tag ,
                    unsigned int tid , unsigned int rid ) ;
#line 204
extern void mfc_putf(void volatile   *ls , unsigned int ea , unsigned int size , unsigned int tag ,
                     unsigned int tid , unsigned int rid ) ;
#line 211
extern void mfc_get(void volatile   *ls , unsigned int ea , unsigned int size , unsigned int tag ,
                    unsigned int tid , unsigned int rid ) ;
#line 252
extern void mfc_write_tag_mask(unsigned int mask ) ;
#line 270
extern void mfc_read_tag_status_all() ;
#line 339 "/usr/include/stdio.h"
extern int printf(char const   * __restrict  __format  , ...) ;
#line 42 "race_condition2.c"
char ls_buffer[65536]  __attribute__((__aligned__(128)))  ;
#line 47 "race_condition2.c"
int spu_main(unsigned long long speid  __attribute__((__unused__)) , unsigned long long ea_buffer ,
             unsigned long long envp  __attribute__((__unused__)) ) 
{ char const   * __restrict  __cil_tmp5 ;
  unsigned long __cil_tmp6 ;
  unsigned long __cil_tmp7 ;
  char *__cil_tmp8 ;
  void volatile   *__cil_tmp9 ;
  unsigned int __cil_tmp10 ;
  unsigned long __cil_tmp11 ;
  unsigned long __cil_tmp12 ;
  char *__cil_tmp13 ;
  void volatile   *__cil_tmp14 ;
  unsigned long long __cil_tmp15 ;
  unsigned int __cil_tmp16 ;
  unsigned long __cil_tmp17 ;
  unsigned long __cil_tmp18 ;
  char *__cil_tmp19 ;
  void volatile   *__cil_tmp20 ;
  unsigned long long __cil_tmp21 ;
  unsigned int __cil_tmp22 ;
  unsigned long __cil_tmp23 ;
  unsigned long __cil_tmp24 ;
  char *__cil_tmp25 ;
  void volatile   *__cil_tmp26 ;
  unsigned long long __cil_tmp27 ;
  unsigned int __cil_tmp28 ;

  {
  {
#line 53
  mfc_write_tag_mask(4294967295U);
#line 62
  __cil_tmp5 = (char const   * __restrict  )"RACE CONDITION 2\n";
#line 62
  printf(__cil_tmp5);
#line 63
  __cil_tmp6 = 0 * 1UL;
#line 63
  __cil_tmp7 = (unsigned long )(ls_buffer) + __cil_tmp6;
#line 63
  __cil_tmp8 = (char *)__cil_tmp7;
#line 63
  __cil_tmp9 = (void volatile   *)__cil_tmp8;
#line 63
  __cil_tmp10 = (unsigned int )ea_buffer;
#line 63
  mfc_get(__cil_tmp9, __cil_tmp10, 16384U, 1U, 0U, 0U);
#line 64
  __cil_tmp11 = 16384 * 1UL;
#line 64
  __cil_tmp12 = (unsigned long )(ls_buffer) + __cil_tmp11;
#line 64
  __cil_tmp13 = (char *)__cil_tmp12;
#line 64
  __cil_tmp14 = (void volatile   *)__cil_tmp13;
#line 64
  __cil_tmp15 = ea_buffer + 16384ULL;
#line 64
  __cil_tmp16 = (unsigned int )__cil_tmp15;
#line 64
  mfc_get(__cil_tmp14, __cil_tmp16, 16384U, 1U, 0U, 0U);
#line 68
  __cil_tmp17 = 0 * 1UL;
#line 68
  __cil_tmp18 = (unsigned long )(ls_buffer) + __cil_tmp17;
#line 68
  __cil_tmp19 = (char *)__cil_tmp18;
#line 68
  __cil_tmp20 = (void volatile   *)__cil_tmp19;
#line 68
  __cil_tmp21 = ea_buffer + 32768ULL;
#line 68
  __cil_tmp22 = (unsigned int )__cil_tmp21;
#line 68
  mfc_putf(__cil_tmp20, __cil_tmp22, 16384U, 1U, 0U, 0U);
#line 71
  __cil_tmp23 = 16384 * 1UL;
#line 71
  __cil_tmp24 = (unsigned long )(ls_buffer) + __cil_tmp23;
#line 71
  __cil_tmp25 = (char *)__cil_tmp24;
#line 71
  __cil_tmp26 = (void volatile   *)__cil_tmp25;
#line 71
  __cil_tmp27 = ea_buffer + 49152ULL;
#line 71
  __cil_tmp28 = (unsigned int )__cil_tmp27;
#line 71
  mfc_put(__cil_tmp26, __cil_tmp28, 16384U, 1U, 0U, 0U);
#line 73
  mfc_read_tag_status_all();
  }
#line 75
  return (0);
}
}
