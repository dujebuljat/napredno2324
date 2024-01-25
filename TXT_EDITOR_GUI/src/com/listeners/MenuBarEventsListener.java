package com.listeners;

import java.util.EventListener;

public interface MenuBarEventsListener extends EventListener {

    void menuBarEventOccurred(String command);
}
