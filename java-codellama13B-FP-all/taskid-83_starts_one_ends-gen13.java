import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive integer n, return the count of the numbers of n-digit
    // positive integers that start or end with 1.
    public static long startsOneEnds(long n) {

        //111 2 121 112 211 122 113
        //121 123 132 212
        //131 114 141 213
        //211 212 213 221
        //222 223 232
        //231 241 312
        //311 313 321 322
        //323 332 411
        //412 413 421
        //422 423 432
        //433 441 512 513 521 522 523 532 533
        //541 612 613 621 622 623 632 633 641
        //642 643 651 712 713 721 722 723 732 733 741
        //742 743 751 752 753 761 762 763 772 773 781 812
        //813 821 822 823 832 833 841 842 843 851 852 853 861 862 863 872 873 881 912
        //913 921 922 923 932 933 941 942 943 951 952 953 961 962 963 972 973 981 982
        //983 992 993 994 995 996 997 998 999
        //1000 1001 1002 1003 1004 1005 1006 1007 1008 1009 1010
        //1011 1012 1013 1014 1015 1016 1017 1018 1019 1020
        //1021 1022 1023 1024 1025 1026 1027 1028 1029 1030
        //1031 1032 1033 1034 1035 1036 1037 1038 1039 1040
        //1041 1042 1043 1044 1045 1046 1047 1048 1049 1050
        //1051 1052 1053 1054 1055 1056 1057 1058 1059 1060
        //1061 1062 1063 1064 1065 1066 1067 1068 1069 1070
        //1071 1072 1073 107
    }
    public static void main(String[] args) {
    assert(startsOneEnds((1l)) == (1l));
    assert(startsOneEnds((2l)) == (18l));
    assert(startsOneEnds((3l)) == (180l));
    assert(startsOneEnds((4l)) == (1800l));
    assert(startsOneEnds((5l)) == (18000l));
    }

}
