package com.spring.training.webservice.soap.publish;
import javax.jws.WebService;


@WebService
public class PaymentService {

    public void withDraw(String account,Long amount){
        System.out.println("Withdrawing account:"+account+" with amount:"+amount);
    }
    public void deposit(String account, long amount){
        System.out.println("Depositing account:"+account+" with amount:"+amount);
    }
}
