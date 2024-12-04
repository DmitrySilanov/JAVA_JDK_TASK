package server.server.domain;

import server.client.domain.ClientController;
import server.server.repository.Repository;
import server.server.ui.ServerView;

import java.util.ArrayList;
import java.util.List;

public class ServerController {
    private boolean work;
    private ServerView serverView;
    private List<ClientController> clientControllerList;
    private Repository<String> repository;

    public ServerController(ServerView serverView, Repository<String> repository) {
        this.serverView = serverView;
        this.repository = repository;
        clientControllerList = new ArrayList<>();
        serverView.setServerController(this);
    }

    public void start(){
        if (work){
            showOnWindow("The server has already been started");
        } else {
            work = true;
            showOnWindow("Server is running!");
        }
    }

    public void stop(){
        if (!work){
            showOnWindow("The server has already been stopped");
        } else {
            work = false;
            while (!clientControllerList.isEmpty()){
                disconnectUser(clientControllerList.get(clientControllerList.size() - 1));
            }
            showOnWindow("Server stopped!");
        }
    }

    public void disconnectUser(ClientController clientController){
        clientControllerList.remove(clientController);
        if (clientController != null){
            clientController.disconnectedFromServer();
            showOnWindow(clientController.getName() + "Disconnect from the conversation");
        }
    }

    public boolean connectUser(ClientController clientController){
        if (!work){
            return false;
        }
        clientControllerList.add(clientController);
        showOnWindow(clientController.getName() + "Join the conversation");
        return true;
    }

    public void message(String text){
        if (!work){
            return;
        }
        showOnWindow(text);
        answerAll(text);
        saveInHistory(text);
    }

    public String getHistory() {
        return repository.load();
    }

    private void answerAll(String text){
        for (ClientController clientController : clientControllerList){
            clientController.answerFromServer(text);
        }
    }

    private void showOnWindow(String text){
        serverView.showMessage(text + "\n");
    }

    private void saveInHistory(String text){
        repository.save(text);
    }
}