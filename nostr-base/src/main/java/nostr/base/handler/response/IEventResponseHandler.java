package nostr.base.handler.response;

/**
 *
 * @author eric
 */
public interface IEventResponseHandler extends IResponseHandler {
    
    public void setSubscriptionId(String subId);
    
    public void setJsonEvent(String jsonEvent);
}
