package br.com.rafasl1.hrpayroll.domain.services;

import br.com.rafasl1.hrpayroll.domain.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return new Payment("Bob", 200.0, days);
    }

}
