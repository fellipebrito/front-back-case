require "rubygems"
require "sinatra/base"
require "sinatra/reloader"
require "json"

class App < Sinatra::Base
  register Sinatra::Reloader

  get '/' do
    @content = {h1: 'The Force Unleashed'}
    erb :index
  end

  get '/.json' do
    @content = {h1: 'The Force Unleashed'}
    @content.to_json
  end

  get '/aloha' do
    @content = {h1: 'The Force Awakens'}
    erb :aloha
  end

  get '/aloha.json' do
    @content = {h1: 'The Force Awakens'}
    @content.to_json
  end
end
