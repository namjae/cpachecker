/* The following code was generated by JFlex 1.4.3 on 14.05.10 11:28 */

package org.sosy_lab.cpachecker.cpa.automatonanalysis;

import java_cup.runtime.*;
@SuppressWarnings(value = { "all" })

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 14.05.10 11:28 from the specification file
 * <tt>D:/Meine Dateien/Uni/Vorlesungen 0910/Software Analyse/CPA/CPAchecker/src/org/sosy_lab/cpachecker/cpa/automatonanalysis/Scanner.jflex</tt>
 */
class AutomatonScanner implements java_cup.runtime.Scanner, AutomatonSym {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 2;
  public static final int YYINITIAL = 0;
  public static final int SQUAREEXPR = 6;
  public static final int CURLYEXPR = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\7\1\3\1\2\1\0\1\3\1\1\16\7\4\0\1\3\1\60"+
    "\1\55\1\0\1\6\1\0\1\62\1\0\1\14\1\15\1\5\1\64"+
    "\1\0\1\16\1\0\1\4\1\10\11\11\1\13\1\12\1\0\1\61"+
    "\1\17\2\0\1\20\1\36\1\27\1\41\1\32\1\42\1\44\1\35"+
    "\1\30\1\6\1\40\1\26\1\24\1\25\1\23\1\34\1\6\1\33"+
    "\1\31\1\22\1\21\1\37\2\6\1\43\1\6\1\57\1\65\1\70"+
    "\1\0\1\6\1\0\1\52\3\6\1\50\1\51\5\6\1\53\1\6"+
    "\1\66\3\6\1\46\1\54\1\45\1\47\5\6\1\56\1\63\1\67"+
    "\1\0\41\7\2\0\4\6\4\0\1\6\2\0\1\7\7\0\1\6"+
    "\4\0\1\6\5\0\27\6\1\0\37\6\1\0\u013f\6\31\0\162\6"+
    "\4\0\14\6\16\0\5\6\11\0\1\6\21\0\130\7\5\0\23\7"+
    "\12\0\1\6\13\0\1\6\1\0\3\6\1\0\1\6\1\0\24\6"+
    "\1\0\54\6\1\0\46\6\1\0\5\6\4\0\202\6\1\0\4\7"+
    "\3\0\105\6\1\0\46\6\2\0\2\6\6\0\20\6\41\0\46\6"+
    "\2\0\1\6\7\0\47\6\11\0\21\7\1\0\27\7\1\0\3\7"+
    "\1\0\1\7\1\0\2\7\1\0\1\7\13\0\33\6\5\0\3\6"+
    "\15\0\4\7\14\0\6\7\13\0\32\6\5\0\13\6\16\7\7\0"+
    "\12\7\4\0\2\6\1\7\143\6\1\0\1\6\10\7\1\0\6\7"+
    "\2\6\2\7\1\0\4\7\2\6\12\7\3\6\2\0\1\6\17\0"+
    "\1\7\1\6\1\7\36\6\33\7\2\0\3\6\60\0\46\6\13\7"+
    "\1\6\u014f\0\3\7\66\6\2\0\1\7\1\6\20\7\2\0\1\6"+
    "\4\7\3\0\12\6\2\7\2\0\12\7\21\0\3\7\1\0\10\6"+
    "\2\0\2\6\2\0\26\6\1\0\7\6\1\0\1\6\3\0\4\6"+
    "\2\0\1\7\1\6\7\7\2\0\2\7\2\0\3\7\11\0\1\7"+
    "\4\0\2\6\1\0\3\6\2\7\2\0\12\7\4\6\15\0\3\7"+
    "\1\0\6\6\4\0\2\6\2\0\26\6\1\0\7\6\1\0\2\6"+
    "\1\0\2\6\1\0\2\6\2\0\1\7\1\0\5\7\4\0\2\7"+
    "\2\0\3\7\13\0\4\6\1\0\1\6\7\0\14\7\3\6\14\0"+
    "\3\7\1\0\11\6\1\0\3\6\1\0\26\6\1\0\7\6\1\0"+
    "\2\6\1\0\5\6\2\0\1\7\1\6\10\7\1\0\3\7\1\0"+
    "\3\7\2\0\1\6\17\0\2\6\2\7\2\0\12\7\1\0\1\6"+
    "\17\0\3\7\1\0\10\6\2\0\2\6\2\0\26\6\1\0\7\6"+
    "\1\0\2\6\1\0\5\6\2\0\1\7\1\6\6\7\3\0\2\7"+
    "\2\0\3\7\10\0\2\7\4\0\2\6\1\0\3\6\4\0\12\7"+
    "\1\0\1\6\20\0\1\7\1\6\1\0\6\6\3\0\3\6\1\0"+
    "\4\6\3\0\2\6\1\0\1\6\1\0\2\6\3\0\2\6\3\0"+
    "\3\6\3\0\10\6\1\0\3\6\4\0\5\7\3\0\3\7\1\0"+
    "\4\7\11\0\1\7\17\0\11\7\11\0\1\6\7\0\3\7\1\0"+
    "\10\6\1\0\3\6\1\0\27\6\1\0\12\6\1\0\5\6\4\0"+
    "\7\7\1\0\3\7\1\0\4\7\7\0\2\7\11\0\2\6\4\0"+
    "\12\7\22\0\2\7\1\0\10\6\1\0\3\6\1\0\27\6\1\0"+
    "\12\6\1\0\5\6\2\0\1\7\1\6\7\7\1\0\3\7\1\0"+
    "\4\7\7\0\2\7\7\0\1\6\1\0\2\6\4\0\12\7\22\0"+
    "\2\7\1\0\10\6\1\0\3\6\1\0\27\6\1\0\20\6\4\0"+
    "\6\7\2\0\3\7\1\0\4\7\11\0\1\7\10\0\2\6\4\0"+
    "\12\7\22\0\2\7\1\0\22\6\3\0\30\6\1\0\11\6\1\0"+
    "\1\6\2\0\7\6\3\0\1\7\4\0\6\7\1\0\1\7\1\0"+
    "\10\7\22\0\2\7\15\0\60\6\1\7\2\6\7\7\4\0\10\6"+
    "\10\7\1\0\12\7\47\0\2\6\1\0\1\6\2\0\2\6\1\0"+
    "\1\6\2\0\1\6\6\0\4\6\1\0\7\6\1\0\3\6\1\0"+
    "\1\6\1\0\1\6\2\0\2\6\1\0\4\6\1\7\2\6\6\7"+
    "\1\0\2\7\1\6\2\0\5\6\1\0\1\6\1\0\6\7\2\0"+
    "\12\7\2\0\2\6\42\0\1\6\27\0\2\7\6\0\12\7\13\0"+
    "\1\7\1\0\1\7\1\0\1\7\4\0\2\7\10\6\1\0\42\6"+
    "\6\0\24\7\1\0\2\7\4\6\4\0\10\7\1\0\44\7\11\0"+
    "\1\7\71\0\42\6\1\0\5\6\1\0\2\6\1\0\7\7\3\0"+
    "\4\7\6\0\12\7\6\0\6\6\4\7\106\0\46\6\12\0\51\6"+
    "\7\0\132\6\5\0\104\6\5\0\122\6\6\0\7\6\1\0\77\6"+
    "\1\0\1\6\1\0\4\6\2\0\7\6\1\0\1\6\1\0\4\6"+
    "\2\0\47\6\1\0\1\6\1\0\4\6\2\0\37\6\1\0\1\6"+
    "\1\0\4\6\2\0\7\6\1\0\1\6\1\0\4\6\2\0\7\6"+
    "\1\0\7\6\1\0\27\6\1\0\37\6\1\0\1\6\1\0\4\6"+
    "\2\0\7\6\1\0\47\6\1\0\23\6\16\0\11\7\56\0\125\6"+
    "\14\0\u026c\6\2\0\10\6\12\0\32\6\5\0\113\6\3\0\3\6"+
    "\17\0\15\6\1\0\4\6\3\7\13\0\22\6\3\7\13\0\22\6"+
    "\2\7\14\0\15\6\1\0\3\6\1\0\2\7\14\0\64\6\40\7"+
    "\3\0\1\6\3\0\2\6\1\7\2\0\12\7\41\0\3\7\2\0"+
    "\12\7\6\0\130\6\10\0\51\6\1\7\126\0\35\6\3\0\14\7"+
    "\4\0\14\7\12\0\12\7\36\6\2\0\5\6\u038b\0\154\6\224\0"+
    "\234\6\4\0\132\6\6\0\26\6\2\0\6\6\2\0\46\6\2\0"+
    "\6\6\2\0\10\6\1\0\1\6\1\0\1\6\1\0\1\6\1\0"+
    "\37\6\2\0\65\6\1\0\7\6\1\0\1\6\3\0\3\6\1\0"+
    "\7\6\3\0\4\6\2\0\6\6\4\0\15\6\5\0\3\6\1\0"+
    "\7\6\17\0\4\7\32\0\5\7\20\0\2\6\23\0\1\6\13\0"+
    "\4\7\6\0\6\7\1\0\1\6\15\0\1\6\40\0\22\6\36\0"+
    "\15\7\4\0\1\7\3\0\6\7\27\0\1\6\4\0\1\6\2\0"+
    "\12\6\1\0\1\6\3\0\5\6\6\0\1\6\1\0\1\6\1\0"+
    "\1\6\1\0\4\6\1\0\3\6\1\0\7\6\3\0\3\6\5\0"+
    "\5\6\26\0\44\6\u0e81\0\3\6\31\0\11\6\6\7\1\0\5\6"+
    "\2\0\5\6\4\0\126\6\2\0\2\7\2\0\3\6\1\0\137\6"+
    "\5\0\50\6\4\0\136\6\21\0\30\6\70\0\20\6\u0200\0\u19b6\6"+
    "\112\0\u51a6\6\132\0\u048d\6\u0773\0\u2ba4\6\u215c\0\u012e\6\2\0\73\6"+
    "\225\0\7\6\14\0\5\6\5\0\1\6\1\7\12\6\1\0\15\6"+
    "\1\0\5\6\1\0\1\6\1\0\2\6\1\0\2\6\1\0\154\6"+
    "\41\0\u016b\6\22\0\100\6\2\0\66\6\50\0\15\6\3\0\20\7"+
    "\20\0\4\7\17\0\2\6\30\0\3\6\31\0\1\6\6\0\5\6"+
    "\1\0\207\6\2\0\1\7\4\0\1\6\13\0\12\7\7\0\32\6"+
    "\4\0\1\6\1\0\32\6\12\0\132\6\3\0\6\6\2\0\6\6"+
    "\2\0\6\6\2\0\3\6\3\0\2\6\3\0\2\6\22\0\3\7"+
    "\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\2\2\1\1\1\3\2\4\1\5\1\6"+
    "\1\7\1\10\1\11\17\3\1\12\1\13\1\14\1\15"+
    "\1\16\2\1\1\17\1\20\1\21\1\22\1\20\1\23"+
    "\1\20\1\24\2\0\1\25\16\3\1\26\4\3\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\2\0"+
    "\23\3\1\0\2\3\1\37\10\3\1\40\1\3\1\41"+
    "\2\3\1\42\3\3\1\43\2\3\1\44\1\45\1\46"+
    "\1\3\1\47\1\50\1\51\1\52\1\3\1\53\1\54"+
    "\1\55\2\3\1\56\1\3\1\57";

  private static int [] zzUnpackAction() {
    int [] result = new int[138];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\71\0\162\0\253\0\344\0\u011d\0\344\0\u0156"+
    "\0\u018f\0\344\0\u01c8\0\344\0\344\0\344\0\344\0\u0201"+
    "\0\u023a\0\u0273\0\u02ac\0\u02e5\0\u031e\0\u0357\0\u0390\0\u03c9"+
    "\0\u0402\0\u043b\0\u0474\0\u04ad\0\u04e6\0\u051f\0\u0558\0\344"+
    "\0\344\0\344\0\u0591\0\u05ca\0\u0603\0\u063c\0\344\0\u0675"+
    "\0\344\0\u06ae\0\u06e7\0\344\0\u0720\0\344\0\u0759\0\u0792"+
    "\0\344\0\u07cb\0\u0804\0\u083d\0\u0876\0\u08af\0\u08e8\0\u0921"+
    "\0\u095a\0\u0993\0\u09cc\0\u0a05\0\u0a3e\0\u0a77\0\u0ab0\0\u018f"+
    "\0\u0ae9\0\u0b22\0\u0b5b\0\u0b94\0\344\0\344\0\344\0\344"+
    "\0\344\0\344\0\344\0\344\0\u0bcd\0\u0c06\0\u0c3f\0\u0c78"+
    "\0\u0cb1\0\u0cea\0\u0d23\0\u0d5c\0\u0d95\0\u0dce\0\u0e07\0\u0e40"+
    "\0\u0e79\0\u0eb2\0\u0eeb\0\u0f24\0\u0f5d\0\u0f96\0\u0fcf\0\u1008"+
    "\0\u1041\0\u107a\0\u10b3\0\u10ec\0\u018f\0\u1125\0\u115e\0\u1197"+
    "\0\u11d0\0\u1209\0\u1242\0\u127b\0\u12b4\0\u018f\0\u12ed\0\u018f"+
    "\0\u1326\0\u135f\0\u018f\0\u1398\0\u13d1\0\u140a\0\u018f\0\u1443"+
    "\0\u147c\0\u018f\0\u018f\0\u018f\0\u14b5\0\u018f\0\u018f\0\u018f"+
    "\0\u018f\0\u14ee\0\u018f\0\u018f\0\u018f\0\u1527\0\u1560\0\u018f"+
    "\0\u1599\0\u018f";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[138];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\5\1\6\2\7\1\10\1\5\1\11\1\5\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\5\1\21"+
    "\1\11\1\22\1\11\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\11\1\32\4\11\1\33\1\34\1\11"+
    "\1\35\1\36\3\11\1\37\3\11\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\5\1\11\2\5"+
    "\1\50\2\5\52\50\1\51\7\50\1\52\3\50\1\53"+
    "\2\5\62\53\1\52\1\53\1\54\1\53\1\55\2\5"+
    "\62\55\1\52\2\55\1\56\73\0\1\7\72\0\1\57"+
    "\1\60\71\0\4\11\6\0\35\11\11\0\1\11\12\0"+
    "\2\13\76\0\1\61\57\0\4\11\6\0\1\11\1\62"+
    "\7\11\1\63\23\11\11\0\1\11\10\0\4\11\6\0"+
    "\13\11\1\64\21\11\11\0\1\11\10\0\4\11\6\0"+
    "\1\65\2\11\1\66\31\11\11\0\1\11\10\0\4\11"+
    "\6\0\3\11\1\67\31\11\11\0\1\11\10\0\4\11"+
    "\6\0\1\70\2\11\1\71\31\11\11\0\1\11\10\0"+
    "\4\11\6\0\15\11\1\72\17\11\11\0\1\11\10\0"+
    "\4\11\6\0\5\11\1\73\27\11\11\0\1\11\10\0"+
    "\4\11\6\0\2\11\1\74\32\11\11\0\1\11\10\0"+
    "\4\11\6\0\13\11\1\75\3\11\1\76\15\11\11\0"+
    "\1\11\10\0\4\11\6\0\13\11\1\77\21\11\11\0"+
    "\1\11\10\0\4\11\6\0\3\11\1\100\31\11\11\0"+
    "\1\11\10\0\4\11\6\0\1\101\34\11\11\0\1\11"+
    "\10\0\4\11\6\0\3\11\1\102\31\11\11\0\1\11"+
    "\10\0\4\11\6\0\26\11\1\103\6\11\11\0\1\11"+
    "\10\0\4\11\6\0\32\11\1\104\2\11\11\0\1\11"+
    "\63\0\1\105\70\0\1\106\71\0\1\107\71\0\1\110"+
    "\5\0\1\50\2\0\52\50\1\0\7\50\1\0\3\50"+
    "\45\0\1\111\1\112\6\0\1\113\10\0\1\114\2\0"+
    "\1\53\2\0\62\53\1\0\1\53\1\0\1\53\1\55"+
    "\2\0\62\55\1\0\2\55\1\0\1\57\1\6\1\7"+
    "\66\57\5\115\1\116\63\115\6\0\4\11\6\0\2\11"+
    "\1\117\32\11\11\0\1\11\10\0\4\11\6\0\11\11"+
    "\1\120\23\11\11\0\1\11\10\0\4\11\6\0\1\11"+
    "\1\121\33\11\11\0\1\11\10\0\4\11\6\0\2\11"+
    "\1\122\32\11\11\0\1\11\10\0\4\11\6\0\21\11"+
    "\1\123\13\11\11\0\1\11\10\0\4\11\6\0\5\11"+
    "\1\124\27\11\11\0\1\11\10\0\4\11\6\0\16\11"+
    "\1\125\16\11\11\0\1\11\10\0\4\11\6\0\7\11"+
    "\1\126\25\11\11\0\1\11\10\0\4\11\6\0\12\11"+
    "\1\127\22\11\11\0\1\11\10\0\4\11\6\0\10\11"+
    "\1\130\24\11\11\0\1\11\10\0\4\11\6\0\1\131"+
    "\2\11\1\132\31\11\11\0\1\11\10\0\4\11\6\0"+
    "\13\11\1\133\21\11\11\0\1\11\10\0\4\11\6\0"+
    "\1\134\34\11\11\0\1\11\10\0\4\11\6\0\10\11"+
    "\1\135\24\11\11\0\1\11\10\0\4\11\6\0\6\11"+
    "\1\136\26\11\11\0\1\11\10\0\4\11\6\0\2\11"+
    "\1\137\32\11\11\0\1\11\10\0\4\11\6\0\27\11"+
    "\1\140\5\11\11\0\1\11\10\0\4\11\6\0\33\11"+
    "\1\141\1\11\11\0\1\11\2\0\5\115\1\142\63\115"+
    "\4\0\1\7\1\116\71\0\4\11\6\0\3\11\1\143"+
    "\31\11\11\0\1\11\10\0\4\11\6\0\12\11\1\144"+
    "\22\11\11\0\1\11\10\0\4\11\6\0\12\11\1\145"+
    "\22\11\11\0\1\11\10\0\4\11\6\0\7\11\1\146"+
    "\25\11\11\0\1\11\10\0\4\11\6\0\10\11\1\147"+
    "\24\11\11\0\1\11\10\0\4\11\6\0\21\11\1\150"+
    "\13\11\11\0\1\11\10\0\4\11\6\0\12\11\1\151"+
    "\22\11\11\0\1\11\10\0\4\11\6\0\1\152\34\11"+
    "\11\0\1\11\10\0\4\11\6\0\7\11\1\153\25\11"+
    "\11\0\1\11\10\0\4\11\6\0\2\11\1\154\32\11"+
    "\11\0\1\11\10\0\4\11\6\0\2\11\1\155\32\11"+
    "\11\0\1\11\10\0\4\11\6\0\14\11\1\156\20\11"+
    "\11\0\1\11\10\0\4\11\6\0\3\11\1\157\31\11"+
    "\11\0\1\11\10\0\4\11\6\0\6\11\1\160\26\11"+
    "\11\0\1\11\10\0\4\11\6\0\5\11\1\161\27\11"+
    "\11\0\1\11\10\0\4\11\6\0\11\11\1\162\23\11"+
    "\11\0\1\11\10\0\4\11\6\0\3\11\1\163\31\11"+
    "\11\0\1\11\10\0\4\11\6\0\30\11\1\145\4\11"+
    "\11\0\1\11\10\0\4\11\6\0\34\11\1\164\11\0"+
    "\1\11\2\0\4\115\1\7\1\142\63\115\6\0\4\11"+
    "\6\0\4\11\1\165\30\11\11\0\1\11\10\0\4\11"+
    "\6\0\13\11\1\166\21\11\11\0\1\11\10\0\4\11"+
    "\6\0\15\11\1\167\17\11\11\0\1\11\10\0\4\11"+
    "\6\0\22\11\1\170\12\11\11\0\1\11\10\0\4\11"+
    "\6\0\12\11\1\171\22\11\11\0\1\11\10\0\4\11"+
    "\6\0\6\11\1\172\26\11\11\0\1\11\10\0\4\11"+
    "\6\0\6\11\1\173\26\11\11\0\1\11\10\0\4\11"+
    "\6\0\20\11\1\174\14\11\11\0\1\11\10\0\4\11"+
    "\6\0\10\11\1\175\24\11\11\0\1\11\10\0\4\11"+
    "\6\0\12\11\1\176\22\11\11\0\1\11\10\0\4\11"+
    "\6\0\13\11\1\177\21\11\11\0\1\11\10\0\4\11"+
    "\6\0\2\11\1\200\32\11\11\0\1\11\10\0\4\11"+
    "\6\0\12\11\1\201\22\11\11\0\1\11\10\0\4\11"+
    "\6\0\30\11\1\201\4\11\11\0\1\11\10\0\4\11"+
    "\6\0\1\202\34\11\11\0\1\11\10\0\4\11\6\0"+
    "\2\11\1\203\32\11\11\0\1\11\10\0\4\11\6\0"+
    "\23\11\1\204\11\11\11\0\1\11\10\0\4\11\6\0"+
    "\2\11\1\205\32\11\11\0\1\11\10\0\4\11\6\0"+
    "\1\206\34\11\11\0\1\11\10\0\4\11\6\0\2\11"+
    "\1\207\32\11\11\0\1\11\10\0\4\11\6\0\6\11"+
    "\1\210\26\11\11\0\1\11\10\0\4\11\6\0\3\11"+
    "\1\211\31\11\11\0\1\11\10\0\4\11\6\0\5\11"+
    "\1\212\27\11\11\0\1\11\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5586];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\1\11\1\1\1\11\2\1\1\11\1\1\4\11"+
    "\20\1\3\11\4\1\1\11\1\1\1\11\2\1\1\11"+
    "\1\1\1\11\2\0\1\11\23\1\10\11\2\0\23\1"+
    "\1\0\50\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[138];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private StringBuilder string = new StringBuilder();
  private SymbolFactory sf;

   public AutomatonScanner(java.io.InputStream r, SymbolFactory sf){
	this(r);
	this.sf = sf;
  }
  public int getLine() {
     return this.yyline;
   }
   public int getColumn() {
     return this.yycolumn;
   }
  
  private Symbol symbol(String name, int sym) {
    return  sf.newSymbol(name, sym);
  }
  private Symbol symbol(String name, int sym, Object val) {
    return  sf.newSymbol(name, sym, val);
  }
  
  private void error(String message) {
    System.out.println("Error at line "+(yyline+1)+", column "+(yycolumn+1)+" : "+message);
  }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  AutomatonScanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  AutomatonScanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1782) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 47: 
          { return symbol("AUTOMATON", AutomatonSym.AUTOMATON);
          }
        case 48: break;
        case 2: 
          { /* ignore */
          }
        case 49: break;
        case 19: 
          { yybegin(YYINITIAL); 
                                   return symbol("CURLYEXPR", AutomatonSym.CURLYEXPR, 
                                   string.toString());
          }
        case 50: break;
        case 46: 
          { return symbol("INITIAL", AutomatonSym.INITIAL);
          }
        case 51: break;
        case 6: 
          { return symbol(":", AutomatonSym.COLON);
          }
        case 52: break;
        case 40: 
          { return symbol("ERROR", AutomatonSym.ERROR);
          }
        case 53: break;
        case 13: 
          { return symbol("!", AutomatonSym.EXCLAMATION);
          }
        case 54: break;
        case 23: 
          { return symbol("!=", AutomatonSym.NEQ);
          }
        case 55: break;
        case 27: 
          { string.append('\t');
          }
        case 56: break;
        case 26: 
          { return symbol("||", AutomatonSym.OR);
          }
        case 57: break;
        case 10: 
          { string.setLength(0); yybegin(STRING);
          }
        case 58: break;
        case 20: 
          { yybegin(YYINITIAL); 
                                   return symbol("CURLYEXPR", AutomatonSym.SQUAREEXPR, 
                                   string.toString());
          }
        case 59: break;
        case 39: 
          { return symbol("STATE", AutomatonSym.STATE);
          }
        case 60: break;
        case 31: 
          { return symbol("TRUE", AutomatonSym.TRUE);
          }
        case 61: break;
        case 9: 
          { return symbol("-", AutomatonSym.MINUS);
          }
        case 62: break;
        case 18: 
          { string.append('\\');
          }
        case 63: break;
        case 45: 
          { return symbol("NONDET", AutomatonSym.NONDET);
          }
        case 64: break;
        case 32: 
          { return symbol("STOP", AutomatonSym.STOP);
          }
        case 65: break;
        case 28: 
          { string.append('\r');
          }
        case 66: break;
        case 5: 
          { return symbol(";", AutomatonSym.SEMICOLON);
          }
        case 67: break;
        case 37: 
          { return symbol("LOCAL", AutomatonSym.LOCAL);
          }
        case 68: break;
        case 8: 
          { return symbol(")", AutomatonSym.CLOSE_BRACKETS);
          }
        case 69: break;
        case 11: 
          { string.setLength(0); yybegin(CURLYEXPR);
          }
        case 70: break;
        case 35: 
          { return symbol("MATCH", AutomatonSym.MATCH);
          }
        case 71: break;
        case 24: 
          { return symbol("==", AutomatonSym.EQEQ);
          }
        case 72: break;
        case 36: 
          { return symbol("LABEL", AutomatonSym.LABEL);
          }
        case 73: break;
        case 21: 
          { return symbol("->", AutomatonSym.ARROW);
          }
        case 74: break;
        case 42: 
          { return symbol("FALSE", AutomatonSym.FALSE);
          }
        case 75: break;
        case 25: 
          { return symbol("&&", AutomatonSym.AND);
          }
        case 76: break;
        case 1: 
          { error("Fallback error"); throw new Error("Illegal character <"+
                                                    yytext()+">");
          }
        case 77: break;
        case 29: 
          { string.append('\"');
          }
        case 78: break;
        case 38: 
          { return symbol("EVAL", AutomatonSym.CHECK);
          }
        case 79: break;
        case 4: 
          { return symbol("INT", AutomatonSym.INTEGER_LITERAL, yytext());
          }
        case 80: break;
        case 17: 
          { yybegin(YYINITIAL); 
                                   return symbol("STRING", AutomatonSym.STRING_LITERAL, 
                                   string.toString());
          }
        case 81: break;
        case 22: 
          { return symbol("DO", AutomatonSym.DO);
          }
        case 82: break;
        case 44: 
          { return symbol("MODIFY", AutomatonSym.MODIFY);
          }
        case 83: break;
        case 15: 
          { return symbol("+", AutomatonSym.PLUS);
          }
        case 84: break;
        case 7: 
          { return symbol("(", AutomatonSym.OPEN_BRACKETS);
          }
        case 85: break;
        case 12: 
          { string.setLength(0); yybegin(SQUAREEXPR);
          }
        case 86: break;
        case 30: 
          { string.append('\n');
          }
        case 87: break;
        case 3: 
          { return symbol("ID", AutomatonSym.IDENTIFIER, yytext());
          }
        case 88: break;
        case 33: 
          { return symbol("EVAL", AutomatonSym.EVAL);
          }
        case 89: break;
        case 34: 
          { return symbol("GOTO", AutomatonSym.GOTO);
          }
        case 90: break;
        case 43: 
          { return symbol("ASSERT", AutomatonSym.ASS);
          }
        case 91: break;
        case 14: 
          { return symbol("=", AutomatonSym.EQ);
          }
        case 92: break;
        case 16: 
          { string.append( yytext() );
          }
        case 93: break;
        case 41: 
          { return symbol("PRINT", AutomatonSym.PRINT);
          }
        case 94: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              {     return symbol("EOF", AutomatonSym.EOF);
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
