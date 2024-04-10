const WebSocket = require('ws');

// Create a WebSocket server
const wss = new WebSocket.Server({ port: 8080 });

wss.on('connection', function connection(ws) {
  console.log('A new client connected.');

  ws.on('message', function incoming(message) {
    console.log('received: %s', message);
    // Echo the message back to the client
    ws.send(`Server received your message: ${message}`);
  });

  ws.on('close', function close() {
    console.log('The connection was closed.');
  });

  ws.on('error', function error(err) {
    console.error('WebSocket error:', err);
  });
});
