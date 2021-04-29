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
@XmlRootElement(name="ValCurs")
@XmlAccessorType(XmlAccessType.FIELD)
public class ValCursDto {
    @XmlElement(name = "Valute")
    private ValuteDto[] valuteDto;
}
