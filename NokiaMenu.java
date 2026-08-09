import java.util.Scanner;
public class NokiaMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("NOKIA MENU");
            System.out.println("1. Phonebook");
            System.out.println("2. Messages");
            System.out.println("3. Chat");
            System.out.println("4. Call Register");
            System.out.println("5. Tones");
            System.out.println("6. Settings");
            System.out.println("7. Call divert");
            System.out.println("8. Games");
            System.out.println("9. Calculator");
            System.out.println("10. Reminders");
            System.out.println("11. Clock");
            System.out.println("12. Profiles");
            System.out.println("13. SIM Services");
            System.out.println("14. Quit/Exit");
            System.out.print("Enter Option: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if(menu == 1){
                System.out.println("PHONEBOOK ");
                System.out.println("1. Search");
                System.out.println("2. Service Nos");
                System.out.println("3. Add Name");
                System.out.println("4. Erase");
                System.out.println("5. Edit");
                System.out.println("6. Assign Tone");
                System.out.println("7. Send b'card");
                System.out.println("8. Options");
                System.out.println("9. Speed Dials");
                System.out.println("10. Voice Tags");
                System.out.print("Enter Option: ");
                int subMenu1 = scanner.nextInt();
                scanner.nextLine();

                if(subMenu1 == 1){
                    System.out.println("Feature Coming Soon!!!");
                }
                if(subMenu1 == 2){
                    System.out.println("Feature Coming Soon!!! ");
                }
                if(subMenu1 == 3){
                    System.out.println("Feature Coming Soon!!! ");
                }
                if(subMenu1 == 4){
                    System.out.println("Feature Coming Soon!!!");
                }
                if(subMenu1 == 5){
                    System.out.println("Feature Coming Soon!!! ");
                }
                if(subMenu1 ==6){
                    System.out.println("Feature Coming Soon!!! ");
                }
                if(subMenu1 == 7){
                    System.out.println("Feature Coming Soon!!! ");
                }
                if(subMenu1 == 8){
                    System.out.println("1. Type of View ");
                    System.out.println("2. Memory Status ");
                    System.out.print("Enter Option: ");
                    int innerSubMenu1 = scanner.nextInt();
                    scanner.nextLine();

                    if( innerSubMenu1 == 1){
                        System.out.println("Feature Coming Soon!!! ");
                    }
                    if(innerSubMenu1 == 2){
                        System.out.println("Feature Coming Soon!!! ");
                    }
                }
                if(subMenu1 == 9){
                    System.out.print("Feature Coming Soon ");
                }
                if(subMenu1 == 10){
                    System.out.print("Feature Coming Soon ");
                }
            }

            if(menu == 2) {
                System.out.println("1. Write Messages ");
                System.out.println("2. Inbox");
                System.out.println("3. Outbox");
                System.out.println("4. Picture Messages");
                System.out.println("5. Templates");
                System.out.println("6. Smileys");
                System.out.println("7. Message Settings");
                System.out.println("8. Info Service");
                System.out.println("9. Voice Mail Number");
                System.out.println("10. Service Command Editor");
                System.out.print("Enter Options: ");
                int subMenu2 = scanner.nextInt();
                scanner.nextLine();

                if (subMenu2 == 1) {
                    System.out.println("Feature Coming Soon ");
                }
                if (subMenu2 == 2) {
                    System.out.println("Feature Coming Soon ");
                }
                if (subMenu2 == 3) {
                    System.out.println("Feature Coming Soon ");
                }
                if (subMenu2 == 4) {
                    System.out.println("Feature Coming Soon ");
                }
                if(subMenu2 == 5) {
                    System.out.println("Feature Coming Soon ");
                }
                if(subMenu2 == 6) {
                    System.out.println("Feature Coming Soon ");
                }
                if(subMenu2 == 7) {
                    System.out.println("1. Set 1");
                    System.out.println("2. Common ");
                    System.out.print("Enter Option: ");
                    int innerSubMenu2 = scanner.nextInt();
                    scanner.nextLine();

                    if(innerSubMenu2 == 1) {
                        System.out.println("1. Message Center Number");
                        System.out.println("2. Messages Sent As");
                        System.out.println("3. Message Validity");
                        System.out.print("Enter Option: ");
                        int innerSubMenu2Option1 = scanner.nextInt();
                        scanner.nextLine();
                        if (innerSubMenu2Option1 == 1) {
                            System.out.println("Feature Coming Soon ");
                        }
                        if (innerSubMenu2Option1 == 2) {
                            System.out.println("Feature Coming Soon ");
                        }
                        if (innerSubMenu2Option1 == 3) {
                            System.out.println("Feature Coming Soon ");
                        }

                    }
                    if (innerSubMenu2 == 2) {
                        System.out.println("1. Delivery Report");
                        System.out.println("2. Reply Via Same Center");
                        System.out.println("3. Character Support");
                        System.out.print("Enter Option: ");
                        int innerSubMenu2Option2 = scanner.nextInt();
                        scanner.nextLine();
                        if (innerSubMenu2Option2 == 1) {
                            System.out.println("Feature Coming Soon ");
                        }
                        if (innerSubMenu2Option2 == 2) {
                            System.out.println("Feature Coming Soon ");
                        }
                        if (innerSubMenu2Option2 == 3) {
                            System.out.println("Feature Coming Soon ");
                        }
                    }
                }
                if(subMenu2 == 8) {
                    System.out.println("Feature Coming Soon ");
                }
                if(subMenu2 == 9) {
                    System.out.println("Feature Coming Soon ");
                }
                if(subMenu2 == 9) {
                    System.out.println("Feature Coming Soon ");
                }

            }

            if(menu==3){
                System.out.println("Feature Coming Soon ");
            }
            if(menu==4){
                System.out.println("1. Missed Calls ");
                System.out.println("2. Received Calls ");
                System.out.println("3. Dialed Numbers ");
                System.out.println("4. Erase Recent Call List");
                System.out.println("5. Show Call Duration");
                System.out.println("6. Show Call Costs");
                System.out.println("7. Call Cost Settings");
                System.out.println("8. Prepaid Credit");
                System.out.print("Enter Options: ");
                int submenu3 = scanner.nextInt();
                scanner.nextLine();

                if(submenu3 ==1){
                    System.out.println("Feature Coming Soon ");
                }
                if(submenu3==2){
                    System.out.println("Feature Coming Soon ");
                }
                if(submenu3==3){
                    System.out.println("Feature Coming Soon ");
                }
                if(submenu3==4){
                    System.out.println("Feature Coming Soon ");
                }
                if(submenu3==5){
                    System.out.println("1. Last Call Duration");
                    System.out.println("2. All Call's Duration");
                    System.out.println("3. Received Call's Duration");
                    System.out.println("4. Dialled Call's Duration");
                    System.out.println("5. Clear Timers");
                    System.out.print("Enter Options ");
                    int innerSubmenu3 = scanner.nextInt();
                    scanner.nextLine();
                    if(innerSubmenu3==1){
                        System.out.println("Feature Coming Soon ");
                    }
                    if(innerSubmenu3==2){
                        System.out.println("Feature Coming Soon ");
                    }
                    if(innerSubmenu3==3){
                        System.out.println("Feature Coming Soon ");
                    }
                    if(innerSubmenu3==4){
                        System.out.println("Feature Coming Soon ");
                    }
                    if(innerSubmenu3==5){
                        System.out.println("Feature Coming Soon ");
                    }
                }
                if(submenu3==6){
                    System.out.println("1. Last Call Cost");
                    System.out.println("2. All Calls Cost");
                    System.out.println("3. Clear Counters");
                    System.out.print("Enter Options: ");
                    int innerSubMenu4 = scanner.nextInt();
                    scanner.nextLine();
                    if(innerSubMenu4==1){
                        System.out.println("Feature Coming Soon ");
                    }
                    if(innerSubMenu4==2){
                        System.out.println("Feature Coming Soon ");
                    }
                    if(innerSubMenu4==3){
                        System.out.println("Feature Coming Soon ");
                    }
                }
                if(submenu3==7){
                    System.out.println("1. Call Cost Limit");
                    System.out.println("2. Show Cost In");
                    System.out.print("Enter Options:");
                    int innerSubMenu5 = scanner.nextInt();
                    scanner.nextLine();

                    if(innerSubMenu5==1){
                        System.out.println("Feature Coming Soon ");
                    }
                    if(innerSubMenu5==2){
                        System.out.println("Feature Coming Soon ");
                    }
                }
                if(submenu3==8){
                    System.out.println("Feature Coming Soon ");
                }
            }
            if(menu==5){
                System.out.println("1. Ringing Tone");
                System.out.println("2. Ringing Volume");
                System.out.println("3. Incoming call Alert");
                System.out.println("4. Composer");
                System.out.println("5. Message Alert Tone");
                System.out.println("6. Keypad Tones");
                System.out.println("7. Warning and Game Tones");
                System.out.println("8. Vibrating Alert");
                System.out.println("9. Screen Saver");
                System.out.print("Enter Options: ");
                int subMenu6 = scanner.nextInt();
                scanner.nextLine();
                if(subMenu6==1){
                    System.out.println("Feature Coming Soon ");
                }
                if(subMenu6==2){
                    System.out.println("Feature Coming Soon ");
                }
                if(subMenu6==3){
                    System.out.println("Feature Coming Soon ");
                }
                if(subMenu6==4){
                    System.out.println("Feature Coming Soon ");
                }
                if(subMenu6==5){
                    System.out.println("Feature Coming Soon ");
                }
                if(subMenu6==6){
                    System.out.println("Feature Coming Soon ");
                }
                if(subMenu6==7){
                    System.out.println("Feature Coming Soon ");
                }
                if(subMenu6==8){
                    System.out.println("Feature Coming Soon ");
                }
                if(subMenu6==9){
                    System.out.println("Feature Coming Soon ");
                }
            }
            if(menu==6){
                System.out.println("1. Call Settings");
                System.out.println("2. Phone Settings");
                System.out.println("3. Security Settings");
                System.out.println("4. Restore Factory Settings");
                System.out.print("Enter Option");
                int subMenu7 = scanner.nextInt();
                scanner.nextLine();
                if(subMenu7==1){
                    System.out.println("1. Automatic Redial");
                    System.out.println("2. Speed Dialling");
                    System.out.println("3. Call Waiting Options");
                    System.out.println("4. Own Number Sending ");
                    System.out.println("5. Phone Line in use");
                    System.out.println("6. Automatic Answer");
                    System.out.print("Enter Option:");
                    int innerSubMenu6 = scanner.nextInt();
                    scanner.nextLine();
                    if(innerSubMenu6 ==1){
                        System.out.println("Feature Coming Soon ");
                    }
                    if(innerSubMenu6 ==2){
                        System.out.println("Feature Coming Soon ");
                    }
                    if(innerSubMenu6 ==3){
                        System.out.println("Feature Coming Soon ");
                    }
                    if(innerSubMenu6 ==4){
                        System.out.println("Feature Coming Soon ");
                    }
                    if(innerSubMenu6 ==5){
                        System.out.println("Feature Coming Soon ");
                    }
                    if(innerSubMenu6 ==6){
                        System.out.println("Feature Coming Soon ");
                    }
                }
                if(subMenu7==2){
                    System.out.println("1. Language");
                    System.out.println("2. Cell Info Display");
                    System.out.println("3. Welcome Note");
                    System.out.println("4. Network Selection");
                    System.out.println("5. Lights");
                    System.out.println("6. Confirm SIM Notification Settings");
                    System.out.print("Enter Options");
                    int innerSubMenu7 = scanner.nextInt();
                    scanner.nextLine();
                    if(innerSubMenu7==1){
                        System.out.println("Feature Coming Soon ");
                    }
                    if(innerSubMenu7==1){
                        System.out.println("Feature Coming Soon ");
                    }
                    if(innerSubMenu7==3){
                        System.out.println("Feature Coming Soon ");
                    }
                    if(innerSubMenu7==4){
                        System.out.println("Feature Coming Soon ");
                    }
                    if(innerSubMenu7==5){
                        System.out.println("Feature Coming Soon ");
                    }
                    if(innerSubMenu7==6){
                        System.out.println("Feature Coming Soon ");
                    }
                }
                if(subMenu7==3){
                    System.out.println("1. Pin Code Request");
                    System.out.println("2. Call Barring Service");
                    System.out.println("3. Fixed Dialling");
                    System.out.println("4. Closed User Group");
                    System.out.println("5. Phone Security");
                    System.out.println("6. Change Access Codes");
                    System.out.print("Enter Options");
                    int innerSubMenu8 = scanner.nextInt();
                    scanner.nextLine();
                    if(innerSubMenu8==1){
                        System.out.println("Feature Coming Soon ");
                    }
                    if(innerSubMenu8==2){
                        System.out.println("Feature Coming Soon ");
                    }
                    if(innerSubMenu8==3){
                        System.out.println("Feature Coming Soon ");
                    }
                    if(innerSubMenu8==4){
                        System.out.println("Feature Coming Soon ");
                    }
                    if(innerSubMenu8==5){
                        System.out.println("Feature Coming Soon ");
                    }
                    if(innerSubMenu8==6){
                        System.out.println("Feature Coming Soon ");
                    }
                }
                if(subMenu7==4){
                    System.out.println("Feature Coming Soon ");
                }
            }
            if(menu==7){
                System.out.println("Feature Coming Soon ");
            }
            if(menu==8){
                System.out.println("Feature Coming Soon ");
            }
            if(menu==9){
                System.out.println("Feature Coming Soon ");
            }
            if(menu==10){
                System.out.println("Feature Coming Soon ");
            }
            if(menu==11){
                System.out.println("1. Alarm Clock");
                System.out.println("2. Clock Settings");
                System.out.println("3. Date Settings");
                System.out.println("4. Stopwatch");
                System.out.println("5. Countdown Timer");
                System.out.println("6. Auto Update of Time and Date");
                System.out.print("Enter Options");
                int subMenu11 = scanner.nextInt();
                scanner.nextLine();
                if(subMenu11==1){
                    System.out.println("Feature Coming Soon ");
                }
                if(subMenu11==2){
                    System.out.println("Feature Coming Soon ");
                }
                if(subMenu11==3){
                    System.out.println("Feature Coming Soon ");
                }
                if(subMenu11==4){
                    System.out.println("Feature Coming Soon ");
                }
                if(subMenu11==5){
                    System.out.println("Feature Coming Soon ");
                }
                if(subMenu11==6){
                    System.out.println("Feature Coming Soon ");
                }
            }
            if(menu==12){
                System.out.println("Feature Coming Soon ");
            }
            if(menu==13){
                System.out.println("Feature Coming Soon ");
            }
            if(menu==14){
                break;
            }
        }

    }
}
