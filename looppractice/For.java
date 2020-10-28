class For {
    public static void main ( String[] args ) {
        int num = 0;
        for (int i = 1; i < 4; i++) {
            System.out.println( "Outer Loop i=" + i );

            // Here is a nested for loop:
            for (int j = 1; j < 4; j++) {
                // '\t' is to format the output with a tab
                System.out.println("\tInner Loop j=" + j);
                // After every iteration, the num variable
                // also increments and if we print num, we'll know how many iterations there were in all
                System.out.println("\t\tTotal num=" + ( ++num ) );
            }
        }
    }
}
