public class GenericsExample<T>
{
        // An object of type T is declared
        T obj;
        GenericsExample(T obj) {
            this.obj = obj;
        }  // constructor

        public T getObject()  { return this.obj; }


        public static void main (String[] args)
        {
            // instance of Integer type
            GenericsExample <Integer> iObj = new GenericsExample<Integer>(4);
            System.out.println(iObj.getObject());

            // instance of String type
             GenericsExample <String> sObj =
                    new GenericsExample<>("Generics Example Done!");
            System.out.println(sObj.getObject());
        }

}
