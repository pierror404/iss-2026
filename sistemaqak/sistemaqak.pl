%====================================================================================
% sistemaqak description   
%====================================================================================
dispatch( eval, arg(V) ).
request( evalR, argr(V) ).
reply( evalRreply, value(V) ).  %%for evalR
%====================================================================================
context(ctxsistemas, "localhost",  "TCP", "8010").
 qactor( sistemas, ctxsistemas, "it.unibo.sistemas.Sistemas").
 static(sistemas).
  qactor( callermock, ctxsistemas, "it.unibo.callermock.Callermock").
 static(callermock).
