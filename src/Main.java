import Character.Character;
import Comic.Comic;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.util.function.Supplier;

// I have created an outline of the project
// as well as a git repo So we can share back and
// forth with the project.

/*
 * All variable names are subject to change and probably will in order to compatible
 * with the API we will be using.
 *
 * Problems to resolve:
 * 1. When selecting options from menus, any String will make it error.
 * 2. Find a way to make the program temporarily stop so the user can see what they searched.
 */


public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner userInput = new Scanner(System.in);
        /*
         * This is an example on how you would build an uri, then make a get request, and get the results to format for
         * display
         * */
//

//

//

        /*
         * This is how I would go about the menu, we can go over this week if you would like.
         * If you have any questions feel free to make a TODO
         * I will try to get them as quick as possible
         * there are some bugs here but i think it is a decent start
         * */

        boolean startMenu = true;


        while (startMenu) {
            System.out.println("Welcome to Marvel search.");
            System.out.println("-*-".repeat(10));
            System.out.println("1) Marvel Character search.");
            System.out.println("2) Marvel Comic Book search.");
            System.out.println("0) Exit.");
            System.out.println("Please make a choice.");

            int searchChoice = 0;
            if (userInput.hasNextInt())
                searchChoice = userInput.nextInt();


            searchChoice:
            switch (searchChoice) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("Please choose a search parameter");

                    System.out.println("1) Name");
                    System.out.println("2) Name starts with");
                    System.out.println("3) Go back");
                    System.out.println("Please make a choice.");

                    int characterSearchParameter = 0;
                    if (userInput.hasNextInt())
                        characterSearchParameter = userInput.nextInt();


                    switch (characterSearchParameter) {
                        case 1:
                            System.out.println("Enter a name");
                            String name = "";
                            if (userInput.hasNext())
                                name = userInput.next();
                            else break searchChoice;
                            String nameSearch = new BuildURI().build("characters", "name", name.replace(" ", "%20"));
                            HttpResponse<Supplier<Character>> nameSearchResults = Request.getCharacter(nameSearch);
                            nameSearchResults.body().get().getData().getResults().forEach(result -> {
                                System.out.println(result.getName());
                                System.out.println(result.getDescription());
                            });
                            break searchChoice;
                        case 2:
                            System.out.println("Please enter a 1-5 characters");
                            String nameStartsWith;
                            if(userInput.hasNext())
                                nameStartsWith = userInput.next();
                            else break searchChoice;
                            String nameStartsWithSearch = new BuildURI().build("characters", "nameStartsWith", nameStartsWith.replace(" ", "%20"));
                            HttpResponse<Supplier<Character>> nameStartsWithSearchResult = Request.getCharacter(nameStartsWithSearch);
                            nameStartsWithSearchResult.body().get().getData().getResults().forEach(result -> System.out.println(result.getName()));
                            break searchChoice;
                    }


                case 2:
                    System.out.println("Comic book search");
                    System.out.println("Choose your search parameter");

                    System.out.println("1) Title");
                    System.out.println("2) Title Starts With");

                    System.out.println("Please make a choice");


                    int comicParamChoice = userInput.nextInt();


                    switch (comicParamChoice) {
                        case 1:
                            System.out.println("Please enter marvel comic book title");
                            String title = "";
                            if(userInput.hasNext())
                                title = userInput.next();
                            else break searchChoice;
                            title = title.replace(" ", "%20");
                            String titleSearch = new BuildURI().build("comics", "title", title);
                            HttpResponse<Supplier<Comic>> comicTitleResult = Request.getComic(titleSearch);

                            comicTitleResult.body().get().getData().getResults().forEach(result -> System.out.println(result.getTitle()));
                            break searchChoice;
                        case 2:
                            System.out.println("Please enter a starts with for a title i.e (Age)");
                            String titleStartsWith = "";
                            if(userInput.hasNext())
                                titleStartsWith = userInput.next();
                            else break searchChoice;
                            titleStartsWith = titleStartsWith.replace(" ", "%20");
                            String comicTitleStartsWithSearch = new BuildURI().build("comics", "titleStartsWith", titleStartsWith);
                            HttpResponse<Supplier<Comic>> comicTitleStartsWithSearchResult = Request.getComic(comicTitleStartsWithSearch);
                            comicTitleStartsWithSearchResult.body().get().getData().getResults().forEach(res -> {
                                System.out.println(res.getTitle());
                                res.getCharacters().getItems().forEach(item__1 -> System.out.println(item__1.getName()));
                                System.out.println("-".repeat(60));
                                System.out.println();
                            });
                            break searchChoice;
                    }

            }

        }

    }


    //Initializing variables being used
//        int choice1 = 0;
//        int choice2 = 0;
//        String keyword = "";
//
//        String searchType = "";
//        String searchTerm = "";
//        String searchTermValue = "";
//
//
//        //Introduction to the program
//        System.out.println("Welcome to the Marvel Search program!\n");
//
//        do {
//            //The first menu which allows the user to select what they are searching.
//            System.out.println("Please select a Category you would like to search.");
//
//            System.out.println("1) Characters");
//            System.out.println("2) Comics");
//            System.out.println("3) Series");
//            System.out.println("0) Quit");
//            System.out.println();
//
//            System.out.print("Please select a category: ");
//
//            //Receive user input.
//            choice1 = userInput.nextInt();
//
//            switch (choice1) {
//                case 1 -> {
//                    //If Characters is selected run this.
//                    //The Character Search Menu
//                    searchType = "Characters";
//                    System.out.println("You selected Characters.");
//                    System.out.println("");
//                    System.out.println("1) Character Name");
//                    System.out.println("2) Character Name start with");
//                    System.out.println("0) Go back");
//                    System.out.println("");
//                    System.out.print("Please select how you'd like to search: ");
//                    choice2 = userInput.nextInt();
//
//                    //Selects option that was picked by the user.
//                    switch (choice2) {
//                        case 1:
//                            searchTerm = "name";
//                            break;
//                        case 2:
//                            searchTerm = "nameStartsWith";
//                            break;
//                        case 0:
//                            System.out.println("Okay, going back.\n");
//                            break;
//                        default:
//                            System.out.println("Not an option, restarting.\n");
//                            break;
//                    }
//
//                    //If the user selects either option that needs a String input, run this.
//                    if (choice2 == 1 || choice2 == 2) {
//                        System.out.println("Please type a keyword: ");
//                        keyword = userInput.next();
//
//                        searchTermValue = keyword;
//                        System.out.println();
//                    }
//                    break;
//                }
//                case 2 -> {
//                    //If Comics is selected run this.
//                    searchType = "Comics";
//                    System.out.println("You selected Comics.\n");
//                    System.out.println("1) Comic Name");
//                    System.out.println("2) Comic Name start with");
//                    System.out.println("0) Go back");
//                    System.out.println("");
//                    System.out.print("Please select how you'd like to search: ");
//                    choice2 = userInput.nextInt();
//
//                    //Selects the option the user chose.
//                    switch (choice2) {
//                        case 1:
//                            searchTerm = "title";
//                            break;
//                        case 2:
//                            searchTerm = "titleStartsWith";
//                            break;
//                        case 0:
//                            System.out.println("Back to main menu.\n");
//                            break;
//                        default:
//                            System.out.println("Not an option, restarting.\n");
//                            break;
//                    }
//
//                    //If the user selects either option that needs a String input, run this.
//                    if (choice2 == 1 || choice2 == 2) {
//                        System.out.println("Please type a keyword: ");
//                        keyword = userInput.next();
//
//                        searchTermValue = keyword;
//                        System.out.println();
//                        break;
//                    } else {
//                        break;
//                    }
//                }
//                case 3 -> {
//                    //If Series is selected run this.
//                    searchType = "Series";
//                    System.out.println("You selected Series.\n");
//                    System.out.println("1) Series Name");
//                    System.out.println("2) Series Name start with");
//                    System.out.println("0) Go back");
//                    System.out.println("");
//                    System.out.print("Please select how you'd like to search: ");
//                    choice2 = userInput.nextInt();
//
//                    //Selects the option the user chose.
//                    switch (choice2) {
//                        case 1:
//                            searchTerm = "title";
//                            break;
//                        case 2:
//                            searchTerm = "titleStartsWith";
//                            break;
//                        case 0:
//                            System.out.println("Returned to main menu.\n");
//                            break;
//                        default:
//                            System.out.println("Not an option, restarting.\n");
//                            break;
//                    }
//
//                    //If the user selects either option that needs a String input, run this.
//                    if (choice2 == 1 || choice2 == 2) {
//                        System.out.println("Please type a keyword: ");
//                        keyword = userInput.next();
//
//                        searchTermValue = keyword;
//                        System.out.println();
//                        break;
//                    } else {
//                        break;
//                    }
//                }
//                case 0 ->
//                    //If quit is selected run this.
//                        System.out.println("Thanks for using Marvel Search! Bye!\n");
//                default ->
//                    //If a choice not in range is selected run this.
//                        System.out.println("Invalid option.\n");
//            }
//        } while (choice1 != 0);
}



