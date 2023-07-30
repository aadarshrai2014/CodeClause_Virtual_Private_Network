//public class VPNSystem {
	import java.util.Scanner;

	// Base module class
	abstract class Module {
	    protected String moduleName;

	    public Module(String moduleName) {
	        this.moduleName = moduleName;
	    }

	    public abstract void runModule();
	}

	// Administrator module
	class AdministratorModule extends Module {
	    public AdministratorModule() {
	        super("Administrator Module");
	    }

	    public void runModule() {
	        System.out.println("Running Administrator Module");
	        // Implement the administrator module functionality here
	        System.out.println("Administrator Module execution completed.");
	    }
	}

	// Marketing module
	class MarketingModule extends Module {
	    public MarketingModule() {
	        super("Marketing Module");
	    }

	    public void runModule() {
	        System.out.println("Running Marketing Module");
	        // Implement the marketing module functionality here
	        System.out.println("Marketing Module execution completed.");
	    }
	}

	// Training module
	class TrainingModule extends Module {
	    public TrainingModule() {
	        super("Training Module");
	    }

	    public void runModule() {
	        System.out.println("Running Training Module");
	        // Implement the training module functionality here
	        System.out.println("Training Module execution completed.");
	    }
	}

	// Main class
	public class VPNSystem {
	    private static Module[] modules;

	    public static void main(String[] args) {
	        initializeModules();
	        displayModuleOptions();
	        int option = getUserOption();

	        if (isValidOption(option)) {
	            Module selectedModule = modules[option - 1];
	            selectedModule.runModule();
	        } else {
	            System.out.println("Invalid option. Exiting the program.");
	        }
	    }

	    private static void initializeModules() {
	        modules = new Module[]{
	                new AdministratorModule(),
	                new MarketingModule(),
	                new TrainingModule()
	        };
	    }

	    private static void displayModuleOptions() {
	        System.out.println("Virtual Private Network (VPN)");
	        System.out.println("Available Modules:");

	        for (int i = 0; i < modules.length; i++) {
	            System.out.println((i + 1) + ". " + modules[i].moduleName);
	        }
	    }

	    private static int getUserOption() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the module option number: ");
	        return scanner.nextInt();
	    }

	    private static boolean isValidOption(int option) {
	        return option >= 1 && option <= modules.length;
	    }
	}
