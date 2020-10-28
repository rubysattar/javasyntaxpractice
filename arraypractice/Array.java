// import jdk.javadoc.internal.doclets.formats.html.resources.standard;

class Array {
    public static void main ( String[] args ) {

        // declaring a string array with a limit of 3
        // when this string was declared, it was assigned 3 values
        // additional indices cannot be assigned to this array after declaration
        // existing indices can be reassigned as long as the 'final' keyword isn't used
        String[] myStringArray = { "Java", "Is", "Specific" };

        // declaring a new integer array with a limit of 3
        // when this array was declared, it was also assigned a max of 3 values
        // which we define later outside of the declaration
        int[] myNumberArray = new int[3];
        myNumberArray[0] = 50;
        myNumberArray[1] = 60;
        myNumberArray[2] = 70;

        System.out.println( "String array length is " + myStringArray.length);
        System.out.println( "Integer array length is " + myNumberArray.length);
        System.out.println( myStringArray[0] + " " + myStringArray[1] + " " + myStringArray[2]);
    }
}
