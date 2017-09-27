/*создаем объект WebSocked и указываем путь для подключения.
     * Подключение произойдет сразу после создания компонента.
     */
var webSocket = new WebSocket("ws://localhost:8080/chat");
var messages = document.getElementById("messages");
var message = document.getElementById("message");
//обработчик события открытия соединения с сервером
webSocket.onopen = function (message) {
    messages.value += "Соединение установлено \n";
};
//обработчик события закрытия соединения с сервером
webSocket.onclose = function (message) {
    messages.value += "Соединение закрыто \n";
};
//обработчик ошибки при работе с сокетом.
webSocket.onerror = function (message) {
    messages.value += "Произошла ошибка \n";
};
//обработчик нажатия кнопки отправки сообщения
function sendMessage() {
    //отправляем сообщение на сервер
    webSocket.send(message.value);
    message.value = "";
}
//обработчик получения сообщения ОТ сервера.
webSocket.onmessage = function (message) {
    messages.value +=  message.data + " \n";
};