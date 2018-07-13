package com.company;

import com.company.model.ExchangeRate;
import com.company.model.RatePb;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    private static final String URL = "https://api.privatbank.ua/p24api/exchange_rates?json&date=";
    //"https://api.privatbank.ua/p24api/exchange_rates?json&date=01.12.2014"

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date: ");
        String date = sc.nextLine();
//        if (date.isEmpty()) {
//            try {
//                System.out.println("The date is empty");
//
//            } catch (NullPointerException o) {
//                JOptionPane.showMessageDialog(null, "Input must be a number.");
//
//            }

//        System.out.println(URL + date + ratePb);

            String result = HttpUtil.sendRequest(URL + date, null, null);

            System.out.println("Result: " + result);

            Gson gson = new GsonBuilder().create();

            RatePb ratePb = gson.fromJson(result, RatePb.class);

            System.out.println("Our data: " + ratePb);

            RatePb currency = gson.fromJson(result, RatePb.class);
            try {
                if (currency.getMyList().size() == 0) {
                    System.out.println("Information about the course of currencies is absent, please check the input");
                } else {
                    for ( int i = 0; i < currency.getMyList().size(); i++ ) {
                        if (currency.getMyList().get(i).getCurrency().equals("USD")) {
                            System.out.println("UAH to USD exchange rate is: " + String.valueOf(currency.getMyList().get(i).getSaleRateNb()) + " grn");
                        }
                    }
                }
            }

        catch (NullPointerException o){
                    System.out.println("No data entered");
                }
            catch (NumberFormatException nfe) {
                System.out.println("Wrong date format");
            }

//                    }
//         catch (Exception o){
//                JOptionPane.showMessageDialog(null, "Generic exception caught");
//         }
            }



        }





