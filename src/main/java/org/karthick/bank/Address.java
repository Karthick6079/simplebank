package org.karthick.bank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Address {

    private @Getter@Setter String address;

    private @Getter@Setter String pincode;

    private @Getter@Setter boolean isCommunicationAddress;

}
