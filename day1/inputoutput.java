class InputOutput {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please Enter two argument : a number and a string");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]);
            String str = args[1];

            for (int i = 0; i < num; i++) {
                System.out.println(str);
            }
        } catch (Exception e) {
            System.out.println("The first argument must be an integer.");
        }
    }
}
