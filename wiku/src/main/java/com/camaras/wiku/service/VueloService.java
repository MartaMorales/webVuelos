package com.airbus.hums.surgeon.service;

import com.airbus.hums.surgeon.model.database.acq.Event;
import com.airbus.hums.surgeon.model.database.acq.Interval;
import com.airbus.hums.surgeon.model.database.aircraftbasic.Flight;
import com.airbus.hums.surgeon.model.database.aircraftbasic.Report;
import com.airbus.hums.surgeon.model.database.rca.RcaResult;

import java.util.Date;
import java.util.List;
import java.util.Set;

public interface IRcaService {

    void processRCA(Event event);

    List<RcaResult> getRcaResults (String flight_id);

    List<RcaResult> getRcaResultsInReportByFlight(Report report);

    List<Flight> findAllFlightsBetweenDates(Date datestart, Date dateend);

    Set<Integer> getAllFPSofIntervals(List<Interval> intervals);

}
