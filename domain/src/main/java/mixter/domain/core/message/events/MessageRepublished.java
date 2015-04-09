package mixter.domain.core.message.events;

import mixter.AggregateId;
import mixter.Event;
import mixter.domain.core.message.MessageId;
import mixter.domain.identity.UserId;

public class MessageRepublished implements Event {
    private MessageId messageId;
    private UserId userId;
    private UserId authorId;
    private String message;

    public MessageRepublished(MessageId messageId, UserId userId, UserId authorId, String message) {
        this.messageId = messageId;
        this.userId = userId;
        this.authorId = authorId;
        this.message = message;
    }

    public MessageId getMessageId() {
        return messageId;
    }

    public UserId getUserId() {
        return userId;
    }

    public String getMessage() {
        return message;
    }

    public UserId getAuthorId() {
        return authorId;
    }

    @Override
    public AggregateId getId() {
        return messageId;
    }
}
