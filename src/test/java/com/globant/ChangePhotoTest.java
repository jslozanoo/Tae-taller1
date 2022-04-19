package com.globant;

import org.testng.annotations.*;

public class ChangePhotoTest {
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
    public void editProfile(){
        System.out.println("You are in the edition profile interface...");
        System.out.println("You select change profile photo...");
    }

    @BeforeMethod
    public void selectChangePhoto(){
        System.out.println("You are in the selection photo interface....");
    }

    @BeforeMethod
    @Parameters({"photo"})
    public void selectPhoto(String photo){
        System.out.println("You select " + photo);
        System.out.println("You are in the editing photo interface...");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("---After method---");
    }

    @AfterMethod
    public void contemplateProfilePhoto(){
        System.out.println("Looking amazing profile photo...");
    }

    @Test
    public void changeProfilePhoto(){
        System.out.println("---Test---");
        System.out.println("Profile photo changed!!");
    }
}
