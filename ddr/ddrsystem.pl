%====================================================================================
% ddrsystem description   
%====================================================================================
event( radar, distance(D) ).
request( getDistance, getDistance(D) ). %richiesta del sistema
reply( radar_repl, distance(D) ).  %%for getDistance
%====================================================================================
context(ctxddrsys, "localhost",  "TCP", "8010").
 qactor( radar_event, ctxddrsys, "it.unibo.radar_event.Radar_event").
 static(radar_event).
  qactor( radar_req_rep, ctxddrsys, "it.unibo.radar_req_rep.Radar_req_rep").
 static(radar_req_rep).
  qactor( mind, ctxddrsys, "it.unibo.mind.Mind").
 static(mind).
