package org.schors.vertx.telegram.bot.api.types.inline;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.schors.vertx.telegram.bot.api.types.InputMessageContent;

public class InlineQueryResultCachedMpeg4Gif {

    private String type;
    private String id;
    @JsonProperty("mpeg4_file_id")
    private String mpeg4FileId;
    private String title;
    private String caption;
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup;
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent;

    public InlineQueryResultCachedMpeg4Gif() {
    }

    public InlineQueryResultCachedMpeg4Gif(String type, String id, String mpeg4FileId, String title, String caption, InlineKeyboardMarkup replyMarkup, InputMessageContent inputMessageContent) {
        this.type = type;
        this.id = id;
        this.mpeg4FileId = mpeg4FileId;
        this.title = title;
        this.caption = caption;
        this.replyMarkup = replyMarkup;
        this.inputMessageContent = inputMessageContent;
    }

    public String getType() {
        return type;
    }

    public InlineQueryResultCachedMpeg4Gif setType(String type) {
        this.type = type;
        return this;
    }

    public String getId() {
        return id;
    }

    public InlineQueryResultCachedMpeg4Gif setId(String id) {
        this.id = id;
        return this;
    }

    public String getMpeg4FileId() {
        return mpeg4FileId;
    }

    public InlineQueryResultCachedMpeg4Gif setMpeg4FileId(String mpeg4FileId) {
        this.mpeg4FileId = mpeg4FileId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public InlineQueryResultCachedMpeg4Gif setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getCaption() {
        return caption;
    }

    public InlineQueryResultCachedMpeg4Gif setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    public InlineKeyboardMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public InlineQueryResultCachedMpeg4Gif setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    public InputMessageContent getInputMessageContent() {
        return inputMessageContent;
    }

    public InlineQueryResultCachedMpeg4Gif setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }
}