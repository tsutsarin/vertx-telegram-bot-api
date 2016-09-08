/*
 *
 *  The MIT License (MIT)
 *
 *  Copyright (c) 2016 schors
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *   The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 *
 */

package org.schors.vertx.telegram.bot.commands;

import org.schors.vertx.telegram.bot.TelegramBot;
import org.telegram.telegrambots.api.objects.Update;

import java.util.HashMap;
import java.util.Map;

public class CommandContext {

    private Map<String, Object> items = new HashMap<>();
    private TelegramBot bot;
    private Update update;

    public CommandContext(TelegramBot bot, Update update) {
        this.bot = bot;
        this.update = update;
    }

    public CommandContext put(String key, Object value) {
        items.put(key, value);
        return this;
    }

    public Object get(String key) {
        return items.get(key);
    }

    public TelegramBot getBot() {
        return bot;
    }

    public Update getUpdate() {
        return update;
    }
}