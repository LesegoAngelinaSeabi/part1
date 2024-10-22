/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart1;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class TaskClass {
    
public class Task {

    private String taskName;
    private int taskNumber;
    private String taskDescription;
    private String developerDetails;
    private double taskDuration;
    private String taskID;
    private String taskStatus;

    private static int taskCounter = 0;

    public Task(String taskName, String taskDescription, String developerDetails, double taskDuration, String taskStatus) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
        this.taskNumber = taskCounter++;
        this.taskID = generateTaskID();
    }

    // Check task description length
    public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;
    }

    