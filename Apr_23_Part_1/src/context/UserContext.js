import { createContext } from "react"

export const UserData = {
    userName : "Prasanna",
    company : "Hexaware",
    topic : "Java FSD React Training"
}

export const UserContext = createContext(UserData);