import { createContext } from "react"

export const themes = {
  light: {
      background: "orange",
      text: "green",
    }
}
export const ColorContext = createContext(themes.light);