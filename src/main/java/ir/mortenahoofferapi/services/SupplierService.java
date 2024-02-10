package ir.mortenahoofferapi.services;

import ir.mortenahoofferapi.repositories.ISupplierRepository;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {
    ISupplierRepository supplierRepository;
    public  SupplierService(ISupplierRepository supplierRepository){
        this.supplierRepository=supplierRepository;
    }
}
