package ru.chuykov.demo.dto;

import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@XmlRootElement(name="Valute")
@XmlAccessorType(XmlAccessType.FIELD)
public class ValuteDto {

    @XmlElement(name = "NumCode")
    private String numCode;

    @XmlElement(name = "Name")
    private String name;

    @XmlElement(name = "Value")
    private String value;

}
