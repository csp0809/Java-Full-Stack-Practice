"use client"
import { SessionProvider, sessionProvider } from "next-auth/react"



const SessionWrapper = ({children}) => {
  return (
    <SessionProvider>{children}</SessionProvider>
  )
}

export default SessionWrapper
