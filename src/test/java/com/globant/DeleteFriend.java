package com.globant;

import org.testng.annotations.*;

public class DeleteFriend {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("---Before Suite---");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("---Before Test---");
    }

    @BeforeSuite
    @Parameters({"browser"})
    public void loadBrowser(String browser){
        System.out.println("Opening " + browser);
    }

    @BeforeSuite
    @Parameters({"page"})
    public void loadPage(String page){
        System.out.println("loading " + page);
    }

    @BeforeTest
    @Parameters({"userMail", "password"})
    public void login(String userMail, String password){
        System.out.println("email: " + userMail);
        System.out.println("password: " + password);
        System.out.println("Login successful!");
        System.out.println("You are in the home page...");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("---Before class---");
    }

    @BeforeClass
    public void goProfilePage(){
        System.out.println("You are in your profile page");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("---Before Method---");
    }

    @BeforeMethod
    public void goToFriendsPage(){
        System.out.println("You are in your friends page...");
    }

    @BeforeMethod
    public void hasFriend(){
        System.out.println("You have a friend!!");
    }

    @BeforeMethod
    @Parameters({"friend"})
    public void selectFriend(String friend){
        System.out.println("You select " + friend);
    }

    @Test
    @Parameters({"friendToDelete"})
    public void deleteFriend(String friend){
        System.out.println("---Test---");
        System.out.println("You delete " + friend);
    }

    @AfterMethod
    public void afterDeleteFriend(){
        System.out.println("---After method---");
        System.out.println("Having less friends");
    }

    @AfterTest
    public void logout(){
        System.out.println("Closing session ...");
    }

    @AfterSuite
    @Parameters({"browser"})
    public void closeBrowser(String browser){
        System.out.println("Closing " + browser);
    }

    @AfterSuite
    @Parameters({"page"})
    public void closePage(String page){
        System.out.println("Closing " + page);
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("---After Suite---");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("---After Test---");
    }

}
