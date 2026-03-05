final String readUtf(final int constantPoolEntryIndex,final char[] charBuffer){
final int utfLength = readUnsigned16(constantPoolEntryIndex);  
  final int utfLengthInBytes = utfLength * 3;  
  final int utfLengthInBytesIndex = constantPoolEntryIndex + utfLengthInBytes;  
  final int utfLengthInBytesIndexPlus1 = utfLengthInBytesIndex + 1;  
  final int utfLengthInBytesIndexPlus2 = utfLengthInBytesIndex + 2;  
  final int utfLengthInBytesIndexPlus3 = utfLengthInBytesIndex + 3;  
  final int utfLengthInBytesIndexPlus4 = utfLengthInBytesIndex + 4;  
  final int utfLengthInBytesIndexPlus5 = utfLengthInBytesIndex + 5;  
  final int utfLengthInBytesIndexPlus6 = utfLengthInBytesIndex + 6;  
  final int utfLengthInBytesIndexPlus7 = utfLengthInBytesIndex + 7;  
  final int utfLengthInBytesIndexPlus8 = utfLengthInBytesIndex + 8;  
  final int utfLengthInBytesIndexPlus9 = utfLengthInBytesIndex + 9;  
  final int utfLengthInBytesIndexPlus10 = utfLengthInBytesIndex + 10;  
  final int utfLengthInBytesIndexPlus11 = utfLengthInBytesIndex + 11;  
  final int utfLengthInBytesIndexPlus12 = utfLengthInBytesIndex + 12;  
  final int utfLengthInBytesIndexPlus13 = utfLengthInBytesIndex + 13;  
  final int utfLengthInBytesIndexPlus14 = utfLengthInBytesIndex + 14;  
  final int utfLengthInBytesIndexPlus15 = utfLengthInBytesIndex + 15;  
  final int utfLengthInBytesIndexPlus16 = utfLengthInBytesIndex + 16;  
  final int utfLengthInBytesIndexPlus17 = utfLengthInBytesIndex + 17;  
  final int utfLengthInBytesIndexPlus18 = utfLengthInBytesIndex + 18;  
  final int utfLengthInBytesIndexPlus19 = utfLengthInBytesIndex + 19;  
  final int utfLengthInBytesIndexPlus20 = utfLengthInBytesIndex + 20;  
  final int utfLengthInBytesIndexPlus21 = utfLengthInBytesIndex
}