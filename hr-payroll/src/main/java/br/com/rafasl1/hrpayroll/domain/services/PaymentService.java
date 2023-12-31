package br.com.rafasl1.hrpayroll.domain.services;

import br.com.rafasl1.hrpayroll.domain.entities.Payment;
import br.com.rafasl1.hrpayroll.domain.entities.Worker;
import br.com.rafasl1.hrpayroll.application.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId, int days) {
        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }

}
