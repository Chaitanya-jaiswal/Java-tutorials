// To be Done

import java.io.Serializable;

class UserSession implements Serializable {
    transient String sessionToken;  // Not saved during serialization
}