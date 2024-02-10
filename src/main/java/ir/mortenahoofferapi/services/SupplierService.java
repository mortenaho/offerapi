package ir.mortenahoofferapi.services;

import ir.mortenahoofferapi.repositories.ISupplierRepository;

public class SupplierService {
    ISupplierRepository supplierRepository;
    public  SupplierService(ISupplierRepository supplierRepository){
        this.supplierRepository=supplierRepository;
    }
}
