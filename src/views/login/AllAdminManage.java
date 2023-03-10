package views.login;

import views.login.view.LoginTemplate;
import views.ProductView;

public class AllAdminManage extends LoginTemplate {

    @Override
    protected void showBody() {
        boolean flag = false;
        do {
            menuAdmin();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    AdminView adminView = new AdminView();
                    break;
                case 2:
                    ProductView productView = new ProductView();
                    break;
                case 0:
                    LoginView loginView = new LoginView();
                    break;
                default:
                    break;
            }

        }while (flag);
    }
    public static void menuAdmin() {
        System.out.println("================= ADMIN MANAGE ===================");
        System.out.println("=                                                =");
        System.out.println("=              1. Manage User                    =");
        System.out.println("=              2. Manage Product                 =");
        System.out.println("=              0. Exit!                          =");
        System.out.println("=                                                =");
        System.out.println("==================================================");
        System.out.println("Choose function to show!");
        System.out.print("===>");
    }
}

