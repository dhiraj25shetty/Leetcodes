//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class MethodRef {
//
//    private static String apply(String s) {
//        return s + "something weird";
//    }
//
//    //    public static void someMethod1(String emp){
////        System.out.print("in static context!!!!");
////    }
////    public  void someMethod2(String emp){
////        System.out.print(emp+">>>in Non static context!!!!");
////    }
//    public  String someMethod3(){
//        System.out.print("in Non static context!!!!");
//        return "something weird";
//    }
//
//
//    public static void main(String args[]){
//        List<String> list= Arrays.asList("dhi,KJI");
//        //    using lambda expression
//       // list.stream().forEach(emp->someMethod1(emp));
//        //using static metho ref
//        //list.stream().forEach(emp->someMethod1(emp));
//
//        //using method ref
//        //using lambda expression calling non static from static context(main())
//        MethodRef m=new MethodRef();
//        m.someDummy();
////        list.stream().forEach(emp->m.someMethod2(emp));
//
//       // using methpod ref with parameter method
//        //list.stream().forEach(m::someMethod2);
//
//        //using method ref with 0 parameter method
//        //list.stream().map(MethodRef::someMethod2);
//    }
//    public void someDummy(){
//        List<String> list2= Arrays.asList("dhi,KJI");
//        MethodRef k=new MethodRef();
//        MethodRefSample mf=new MethodRefSample();
//        List<String> stringStream;
//        stringStream = list2.stream().map(s -> someDummy()
//        ).collect(Collectors.toList());
//        System.out.print(stringStream);
//    }
//
//
//
//}
