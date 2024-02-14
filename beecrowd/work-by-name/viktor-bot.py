import os 
import discord 

client = discord.Client(intents=discord.Intents.default())
intents = discord.Intents.default()
intents.message_content = True

@client.event
async def on_ready():
    print("Nós logamos como {0.user}".format(client))

@client.event
async def on_message(message):

    if message.content.startswith('$hello'):
        await message.channel.send('Hello!')
    
client.run('MTEzODk1ODMzNDYzNzEyNTc5Mw.G-CDbr.IhRaApxjAZZAtPDv3jeTxqgRbwzP_QfzceDpgY')