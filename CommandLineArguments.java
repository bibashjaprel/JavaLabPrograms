public class CommandLineArguments {
  public static void main(String[] args) {
      // Check if there are any command line arguments
      if (args.length == 0) {
          System.out.println("No command line arguments found.");
      } else {
          System.out.println("Command line arguments:");
          // Iterate through all command line arguments and print them
          for (int i = 0; i < args.length; i++) {
              System.out.println("Argument " + (i+1) + ": " + args[i]);
          }
      }
  }
}
