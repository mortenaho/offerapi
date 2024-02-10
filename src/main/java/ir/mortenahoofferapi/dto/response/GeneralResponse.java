package ir.mortenahoofferapi.dto.response;

import jakarta.annotation.Nullable;
import lombok.Data;


public class GeneralResponse<T> {
    public int ResponseCode;
    public String ResponseMessage;
    @Nullable
    public T ResponseObject;
}