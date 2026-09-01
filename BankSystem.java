import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String accountHolder = "";
        double balance = 0.0;
        boolean isAccountCreated = false;
        int choice;

        do {
            System.out.println("\n--- Bank Management System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Holder Name: ");
                    scanner.nextLine(); // clear buffer
                    accountHolder = scanner.nextLine();
                    balance = 0.0;
                    isAccountCreated = true;
                    System.out.println("Account created successfully for " + accountHolder + "!");
                    break;

                case 2:
                    if (isAccountCreated) {
                        System.out.println("Account Holder: " + accountHolder);
                        System.out.println("Current Balance: Rs. " + balance);
                    } else {
                        System.out.println("Please create an account first!");
                    }
                    break;

                case 3:
                    if (isAccountCreated) {
                        System.out.print("Enter amount to deposit: Rs. ");
                        double deposit = scanner.nextDouble();
                        if (deposit > 0) {
                            balance += deposit;
                            System.out.println("Successfully deposited Rs. " + deposit);
                        } else {
                            System.out.println("Invalid amount!");
                        }
                    } else {
                        System.out.println("Please create an account first!");
                    }
                    break;

                case 4:
                    if (isAccountCreated) {
                        System.out.print("Enter amount to withdraw: Rs. ");
                        double withdraw = scanner.nextDouble();
                        if (withdraw > 0 && withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("Successfully withdrawn Rs. " + withdraw);
                        } else if (withdraw > balance) {
                            System.out.println("Insufficient balance!");
                        } else {
                            System.out.println("Invalid amount!");
                        }
                    } else {
                        System.out.println("Please create an account first!");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the Bank System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please choose between 1 to 5.");
            }
        } while (choice != 5);

        scanner.close();
    }
                          }
