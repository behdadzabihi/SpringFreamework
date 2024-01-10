//package com.spring.training.webservice.soap.client;
//
//import com.nikamooz.spring.session06.PaymentService;
//
//import javax.xml.namespace.QName;
//import javax.xml.ws.Service;
//import javax.xml.ws.WebEndpoint;
//import javax.xml.ws.WebServiceClient;
//import java.net.MalformedURLException;
//import java.net.URL;
//
///**
// * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
// * Date: 4/9/21
// * Time: 11:12 AM
// */
//
//@WebServiceClient(name = "PaymentServiceImpl",
//        wsdlLocation = "http://localhost:9195/paymentService?wsdl",
//        targetNamespace = "http://session06.spring.nikamooz.com/")
//public class PaymentServiceImpl extends Service {
//
//    static URL WSDL_LOCATION = null;
//
//    static {
//        try{
//            WSDL_LOCATION = new URL("http://localhost:9195/paymentService?wsdl");
//        }catch (MalformedURLException ex){
//            ex.printStackTrace();
//        }
//    }
//
//    public final static QName SERVICE = new QName("http://session06.spring.nikamooz.com/", "PaymentServiceService");
//    public final static QName PaymentServiceImplPort = new QName("http://session06.spring.nikamooz.com/", "PaymentServicePort");
//
//    protected PaymentServiceImpl() {
//        super(WSDL_LOCATION, SERVICE);
//    }
//
//    @WebEndpoint(name = "PaymentServiceImplPort")
//    public PaymentService getPaymentServiceImplPort() {
//        return super.getPort(PaymentServiceImplPort, PaymentService.class); }
//
//    public void withdraw(String account, long amount) {
//        getPaymentServiceImplPort().withdraw(account, amount);
//    }
//
//    public void deposit(String account, long amount) {
//        getPaymentServiceImplPort().deposit(account, amount);
//    }
//}
