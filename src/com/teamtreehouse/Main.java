package com.teamtreehouse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Instantiate a new Prompter object
        // and prompt for the story template
        Prompter prompter = new Prompter();
        String story = null;
        try {
            story = prompter.promptForTemplate();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.exit(0);
        }
        Template tmpl = new Template(story);
        // Use the prompter object to have it do the prompting,
        // censoring and outputting.  Call Prompter.run
        prompter.run(tmpl);
        // This should really happen in the Prompter.run method,
        // let's get these implemetation details out of the main method
    }
}
