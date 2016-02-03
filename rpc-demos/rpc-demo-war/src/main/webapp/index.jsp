<!DOCTYPE html>
<html>
    <head>
        <script src="rpc/brutusin-rpc.js"></script>
        <script language='javascript'>
            var http = brutusin["rpc"].initHttpEndpoint("<%=request.getContextPath() + org.brutusin.rpc.RpcConfig.getPath()+"/http"%>");
            var wsk = brutusin["rpc"].initWebsocketEndpoint("<%=request.getContextPath() + org.brutusin.rpc.RpcConfig.getPath()+"/wskt"%>");
        </script>
        <script language='javascript'>
            http.ajax({
                service: "rpc.http.version",
                load: function (response) {
                    alert(JSON.stringify(response));
                }
            });
        </script>
    </head>
    <body>
        <h1>Congratulations!</h1> You have successfully created a Brutusin-RPC war application</h1>
    <div>The functional testing module is accessible <a href="rpc/repo">here</a></div>
</body>
</html>
