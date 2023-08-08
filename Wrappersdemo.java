public class Wrappersdemo {
    public static void main(String[] args) {
        int i = 10;
        short s = 40;
        byte b = 20;
        double d = 10.8d;
        float f = 15.098f;
        char c = 'a';
        boolean b2 = true;

        //Autoboxing

        Integer intobj = i;
        Short shortobj = s;
      Byte byteobj = b;
      Double doubleobj = d;
      Float floatobj = f;
      Character charobj = c;
      Boolean boolobj = b2;

        System.out.println("Byte object:"+byteobj);
        System.out.println("Integer object:"+intobj);
        System.out.println("Double object:"+doubleobj);
        System.out.println("Float object:"+floatobj);
        System.out.println("Short onject:"+shortobj);
        System.out.println("Character object:"+charobj);
        System.out.println("Boolean object:"+boolobj);

        //unboxing

        int intvalue = intobj;
        short shortvalue = shortobj;
        byte bytevalue = byteobj;
        double doublevalue = doubleobj;
        float floatvalue = floatobj;
        char charvalue = charobj;
        boolean boolvalue = boolobj;

        System.out.println("Byte value:"+bytevalue);
        System.out.println("int value:"+intvalue);
        System.out.println("short value:"+shortvalue);
        System.out.println("Double value:"+doublevalue);
        System.out.println("float value:"+floatvalue);
        System.out.println("Character value:"+charvalue);
        System.out.println("boolean value:"+boolvalue);









    }
}
