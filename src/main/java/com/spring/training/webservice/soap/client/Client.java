//package com.spring.training.webservice.soap.client;
//
//
//
///**
// * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
// * Date: 4/9/21
// * Time: 11:11 AM
// */
//
//public class Client {
//
//    public static void main_(String[] args) {
//        String account ="simple-account-demo";
//        long amount = 130000;
//
//        PaymentServiceImpl paymentService = new PaymentServiceImpl();
//        paymentService.withdraw(account, amount);
//
//        paymentService.deposit(account, amount);
//
//    }
//
//    public static void main(String[] args) {
//        PaymentServiceProxy paymentService = new PaymentServiceProxy();
//        String account ="simple-account-demo";
//        long amount = 130000;
//        paymentService.getPaymentServicePort().withdraw(account, amount);
//
//        paymentService.getPaymentServicePort().deposit(account, amount);
//
//
//    }
//}
