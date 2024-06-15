package org.example.riskStrategies;

import org.example.agents.Citizen;
import org.example.implants.Implant;
/**
 * Średniego strategia ryzyka
 */
public class MediumRiskStrategyDefault implements RiskStrategy{
    /**
     * Decyduje, czy citizen powinien kupić implant na podstawie jego chęci zakupu i szansy na awarię implanta.
     * <p>
     * @param citizen citizen rozważający zakup implanta
     * @param implant implant do zakupu
     * @return true, jeśli citizen powinien kupić implant; false w przeciwnym razie
     */
    public boolean shouldIBuyImplant(Citizen citizen, Implant implant){
        if(citizen.getDesireBuyImplantNow() * 0.02 > implant.getProbOfFail()) return true;
        else return false;
    }
}
