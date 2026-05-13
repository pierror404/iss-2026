%====================================================================================
% fireflysynch description   
%====================================================================================
dispatch( cellstate, cellstate(X,Y,COLOR) ).
event( sync, sync(TIMER) ).
event( sonardata, distance(D) ).
event( unsync, unsync(CMD) ).
%====================================================================================
context(ctxgrid, "127.0.0.1",  "TCP", "8050").
context(ctxfireflysynch, "127.0.0.1",  "TCP", "8040").
 qactor( griddisplay, ctxgrid, "external").
  qactor( sonarmock, ctxfireflysynch, "it.unibo.sonarmock.Sonarmock").
 static(sonarmock).
  qactor( orchestrator, ctxfireflysynch, "it.unibo.orchestrator.Orchestrator").
 static(orchestrator).
  qactor( firefly, ctxfireflysynch, "it.unibo.firefly.Firefly").
dynamic(firefly). %%Oct2023 
