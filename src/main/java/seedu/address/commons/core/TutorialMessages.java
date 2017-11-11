package seedu.address.commons.core;

import java.util.ArrayList;

//@@author Alim95

/**
 * Contains the tutorial messages.
 */
public class TutorialMessages {

    public static final int TOTAL_NUM_STEPS = 9;

    /* Introductory Messages */
    public static final String INTRO_BEGIN = "Welcome to Bluebird! Would you like to go through the tutorial?";
    public static final String INTRO_TWO = "This is the command box, where you will enter your commands.";
    public static final String INTRO_THREE = "This is the result display, where "
            + "I will display the outcome of your commands.";
    public static final String INTRO_FOUR = "This is the person and task list panel, "
            + "where you will see your list of contacts and tasks";
    public static final String INTRO_FIVE = "This is the sort menu, where you can select how to sort the list.";
    public static final String INTRO_SIX = "This is the search box, where "
            + "you are able to search for the person you want.";
    public static final String INTRO_SEVEN = "Features of Bluebird:\n"
            + "1. Add contacts/tasks\n"
            + "2. Delete contacts/tasks\n"
            + "3. Edit contacts/tasks\n"
            + "4. Find contacts/tasks\n"
            + "5. Add remark to contacts\n"
            + "6. Select a contact\n"
            + "7. Pin/Unpin a contact\n"
            + "8. Alias/Unalias\n"
            + "9. List all alias\n"
            + "10. Hide a contact\n"
            + "11. Clear all contacts and tasks\n"
            + "12. List all contacts and tasks\n"
            + "13. List all pinned contacts\n"
            + "14. Sort list of contacts\n"
            + "15. Help window\n"
            + "16. History of command inputs\n"
            + "17. Undo a command\n"
            + "18. Redo a command\n"
            + "19. Toggle to person/task mode\n"
            + "20. Toggle to parent/child mode\n"
            + "21. Exit Bluebird";

    public static final String INTRO_END = "Bluebird is set to Child Mode by default every time Bluebird "
            + "is launched. To activate all commands, toggle to parent mode!\n"
            + "The only commands available in Child Mode are:\n"
            + "1. add\n"
            + "2. find\n"
            + "3. findpin\n"
            + "4. list\n"
            + "5. listpin\n"
            + "6. remark\n"
            + "7. sort\n"
            + "8. history\n"
            + "9. undo\n"
            + "10. redo\n"
            + "11. person\n"
            + "12. task\n"
            + "13. parent";

    /* Command usage messages */
    public static final String USAGE_BEGIN = "Let's try out the different commands of Bluebird! Activate Parent Mode "
            + "by typing \"parent\" into the command box and pressing enter to enable all commands! "
            + "Click on command box and Press F2 to view the list of commands and enter the commands "
            + "on the command box to execute it. A parameter in [ ] means it is optional.";

    /* Concluding message */
    public static final String CONCLUSION = "That's it for the tutorial! If you still need help, you can "
            + "type \"help\" on the command box or press F1 for the user guide.";

    /* List of all introductory messages */
    public static final ArrayList<String> INTRO_LIST = new ArrayList<String>() {
        {
            add(INTRO_TWO);
            add(INTRO_THREE);
            add(INTRO_FOUR);
            add(INTRO_FIVE);
            add(INTRO_SIX);
            add(INTRO_SEVEN);
            add(INTRO_END);
            add(USAGE_BEGIN);
        }
    };
}
